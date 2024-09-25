package uz.pdp.back.service;

import uz.pdp.back.model.Tariff;
import uz.pdp.back.payloads.LoginDto;
import uz.pdp.back.payloads.RegisterDto;

public interface TariffService {

    Tariff[] getAll();
    Tariff getById(int id);

}
