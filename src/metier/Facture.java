package metier;

import java.time.LocalDate;

public class Facture
{
	private int montant;
	private LocalDate Date;

	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	Facture (int montant, LocalDate date)
	{
		this.montant = montant;
		this.Date = Date;
	}
	
	public Client getClient()
	{
		return getClient();
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return this.montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai si la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		
		return true;
	}


	
	public LocalDate getDate()
	{
		return this.Date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}