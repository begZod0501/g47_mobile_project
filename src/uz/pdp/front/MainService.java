package uz.pdp.front;

import uz.pdp.back.model.SimCard;
import uz.pdp.back.model.Tariff;
import uz.pdp.back.payloads.LoginDto;
import uz.pdp.back.payloads.RegisterDto;
import uz.pdp.back.payloads.SimCardDto;
import uz.pdp.back.service.AuthService;
import uz.pdp.back.service.SimCardService;
import uz.pdp.back.service.TariffService;
import uz.pdp.back.service.impl.AuthServiceImpl;
import uz.pdp.back.service.impl.SimCardServiceImpl;
import uz.pdp.back.service.impl.TariffServiceImpl;

import java.util.Objects;
import java.util.Scanner;

public class MainService {
    private static AuthService authService = AuthServiceImpl.getInstance();
    private static TariffService tariffService = TariffServiceImpl.getInstance();
    private static SimCardService simCardService = SimCardServiceImpl.getInstance();
    private static Scanner scannerInt = new Scanner(System.in);
    private static Scanner scannerStr = new Scanner(System.in);
    private static Integer currentUserId = null;

    public static void main(String[] args) {
        System.out.println("--------------Hello---------------");

        while (true) {
            showRegistration();
            int index = getInputAsInt("Choose => ");
            boolean isSuccess = switch (index) {
                case 1 ->  signIn();
                case 2 ->  signUp();
                default -> errorInput();
            };
            if (!isSuccess) continue;

            boolean exit = false;
            while (!exit) {
                showMainManu();
                int indexMain = getInputAsInt("Choose => ");
                switch (indexMain) {
                    case 1: addSimCard(); break;
                    case 2: call(); break;
                    case 3: sms(); break;
                    case 4: internet(); break;
                    case 5: fillBalance(); break;
                    case 6: monitoring(); break;
                    case 7: {
                        exit = true;
                        System.out.println("----- Rahmattt------------");
                        break;
                    }
                }
            }
        }




    }

    private static boolean errorInput() {
        System.out.println("🔴🔴🔴🔴🔴Invalid input!!!!!!!!!!!!!!!!!!");
        return false;
    }


    private static void call() {
    }

    private static void monitoring() {
    }

    private static void exit() {
    }

    private static void fillBalance() {


    }

    private static void internet() {

    }

    private static void sms() {
    }

    private static void addSimCard() {
        String number = getInputAsString("Enter number: ");
        int userId = currentUserId;

        Tariff[] tariffs = tariffService.getAll();
        for (int i = 0; i < tariffs.length; i++) {
            System.out.println((i+1) + " =>  " + tariffs[i]);
        }
        int index = getInputAsInt("Choose => ");

        try{
            if (index<1 || index>3){
                throw new ArrayIndexOutOfBoundsException(index);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return;
        }


        Tariff tariff = tariffs[index - 1];
        tariff.setMb(-10000000);
        int tariffId = tariff.getId();

        SimCardDto simCardDto = new SimCardDto(number, userId, tariffId);
        boolean isSuccess = simCardService.addSimCard(simCardDto);
    }


    private static boolean signUp() {
        String name = getInputAsString("Enter your name: ");
        String username = getInputAsString("Enter your username: ");
        String password = getInputAsString("Enter your password: ");

        RegisterDto dto = new RegisterDto(name, username, password);

        Integer userId = authService.register(dto);
        currentUserId = userId;
        return Objects.nonNull(userId);
    }

    private static boolean signIn() {
        String username = getInputAsString("Enter your username: ");
        String password = getInputAsString("Enter your password: ");

        LoginDto dto = new LoginDto(username, password);

        Integer userId = authService.login(dto);
        currentUserId = userId;
        return userId != null;
    }


    public static String getInputAsString(String prompt) {
        System.out.print(prompt);
        return scannerStr.nextLine();
    }

    public static int getInputAsInt(String prompt) {
        System.out.print(prompt);
        return scannerInt.nextInt();
    }

    private static void showMainManu() {
        System.out.println("--------------MainManu-------------");
        System.out.println("1 => Add SimCard");
        System.out.println("2 => Call");
        System.out.println("3 => Sms");
        System.out.println("4 => Internet");
        System.out.println("5 => Fill balance");
        System.out.println("6 => Monitoring");
        System.out.println("7 => exit");
    }

    private static void showRegistration() {
        System.out.println("Registration");
        System.out.println("1 - > SignIn");
        System.out.println("2 - > SignUp");
    }
}
