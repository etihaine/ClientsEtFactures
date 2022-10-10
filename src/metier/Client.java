package metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client
{
	private String nom;
	private int montant;
	private boolean reglee;
	private ArrayList<String> Facture = new ArrayList<String>();
	private ArrayList<String> Client = new ArrayList<String>();

	
	
	public Client(String nom)
	{
		this.nom = nom ;
		Client.add(nom);
	}


	
	public String getNom()
	{
		return this.nom;
	}
	

	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant)
	{
		
		return null;
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		return null;
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		return 0;
	}

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
		return null;
	}	
	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		return null;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		return null;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
		
	}
}

