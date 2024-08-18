package umg.ejercicio;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import umg.ejercicio.botTelegram.PokemonBot;
import umg.ejercicio.botTelegram.bot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        //bot narubot = new bot();
            PokemonBot poke = new PokemonBot();

        botsApi.registerBot(poke);
        System.out.println("El bot está funcionando...");




        }
        catch (Exception ex){

            System.out.println("error" +ex.getMessage());
        }
    }
}