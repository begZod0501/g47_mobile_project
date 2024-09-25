package uz.pdp.back.service.impl;

import uz.pdp.back.model.SimCard;
import uz.pdp.back.model.Tariff;
import uz.pdp.back.model.User;
import uz.pdp.back.payloads.LoginDto;
import uz.pdp.back.payloads.RegisterDto;
import uz.pdp.back.payloads.SimCardDto;
import uz.pdp.back.service.AuthService;
import uz.pdp.back.service.SimCardService;
import uz.pdp.back.service.TariffService;

public class SimCardServiceImpl implements SimCardService {
    private SimCardServiceImpl() {}
    private static final SimCardService instance = new SimCardServiceImpl();
    public static SimCardService getInstance() {return instance;}

    private static final SimCard[] SIM_CARDS = new SimCard[50];

    private AuthService authService = AuthServiceImpl.getInstance();
    private TariffService tariffService = TariffServiceImpl.getInstance();



    private int getValidElementsCounts() {
        int index = findEmptyIndex();
        return index == -1 ? SIM_CARDS.length : index;
    }

    private int findEmptyIndex(){
        for (int i = 0; i < SIM_CARDS.length; i++) {
            if (SIM_CARDS[i] == null)
                return i;
        }
        return -1;
    }


    @Override
    public boolean addSimCard(SimCardDto dto) {
        // phone

        User user = authService.getUserById(dto.userId());
        if (user == null) {
            System.out.println("user not found");
            return false;
        }

        Tariff tariff = tariffService.getById(dto.tariffId());
        if (tariff == null) {
            System.out.println("tariff not found");
            return false;
        }

        SimCard simCard = new SimCard();
        simCard.setPhone(dto.number());
        simCard.setUser(user);
        simCard.setTariff(tariff);
        simCard.setBalance(100);
        simCard.setRemainingMb(tariff.getMb());
        simCard.setRemainingMinute(tariff.getMinute());
        simCard.setRemainingSms(tariff.getSms());
        return true;
    }
}
