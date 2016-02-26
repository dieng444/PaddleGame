import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import game.*;
import communication.*;

public class Server {
	
	/**
	 * Port d'écoute du serveur
	 */
	public static final int PORT = 1337;
	/**
	 * La socket serveur 
	 */
	public static ServerSocket ss = null;
	/**
	 * List des gestionnaire de joueur
	 */
	private static List<GamerManagement> gamersManagement;
	
	public static void main(String[] args) {
		try {
			gamersManagement = new ArrayList<GamerManagement>();
			ss = new ServerSocket(PORT);
			System.out.println("Le serveur est à l'écoute du port "+ss.getLocalPort());
			int index = 1;
			while(true) {
				Socket client = ss.accept();
				GamerManagement gm = new GamerManagement(index,client);
				gamersManagement.add(gm);
				for (GamerManagement g : gamersManagement) {
					g.setGamerManagement(gamersManagement);
				}
				gm.start();
				index++;
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
