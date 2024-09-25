package uz.pdp.back.service.impl;

import uz.pdp.back.model.Tariff;
import uz.pdp.back.model.User;
import uz.pdp.back.payloads.LoginDto;
import uz.pdp.back.payloads.RegisterDto;
import uz.pdp.back.service.AuthService;
import uz.pdp.back.service.TariffService;

import java.util.Arrays;

public class TariffServiceImpl implements TariffService {
    private TariffServiceImpl() {}
    private static final TariffService instance = new TariffServiceImpl();
    public static TariffService getInstance() {return instance;}

    private static final Tariff[] TARIFFS;

    static {
        Tariff tariff1 = new Tariff("Pul ko'p", 10000F, 100, 10, 100, false, false, false, 10F, 20F, 5F);
        Tariff tariff2 = new Tariff("Vip", 20000F, 0, 0, 0, true, true, true);
        Tariff tariff3 = new Tariff("Talaba", 5000F, 10, 5, 10, false, false, false, 5F, 10F, 2F);
        TARIFFS = new Tariff[] { tariff1, tariff2, tariff3 };
    }

    @Override
    public Tariff[] getAll() {
        return Arrays.copyOf(TARIFFS, getValidElementsCounts());

    }

    @Override
    public Tariff getById(int id) {
        for (Tariff tariff : TARIFFS) {
            if (tariff != null && tariff.getId() == id) {
                return tariff;
            }
        }
        return null;
    }

    private int getValidElementsCounts() {
        int index = findEmptyIndex();
        return index == -1 ? TARIFFS.length : index;
    }

    private int findEmptyIndex(){
        for (int i = 0; i < TARIFFS.length; i++) {
            if (TARIFFS[i] == null)
                return i;
        }
        return -1;
    }
}
