package br.ufg.javank.presentation;

import br.ufg.javank.domain.account.Account;
import br.ufg.javank.domain.account.AccountType;
import br.ufg.javank.domain.client.JuridicPerson;
import br.ufg.javank.domain.client.PhysicalPerson;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Welcome to Javank, your best and only bank choose!" );
    	JuridicPerson google = new JuridicPerson();
    	JuridicPerson microsoft = new JuridicPerson();
    	PhysicalPerson adolfo = new PhysicalPerson();
    	PhysicalPerson rodolfo = new PhysicalPerson();
    	google.createAccount(AccountType.SPECIAL);
    	google.createAccount(AccountType.SAVING);
    	microsoft.createAccount(AccountType.SPECIAL);
    	adolfo.createAccount(AccountType.SAVING);
    	rodolfo.createAccount(AccountType.SPECIAL);
    	
    	Account googleFirstAccount = google.getAccounts().get(0);
    	googleFirstAccount.deposit(980.98);
    	googleFirstAccount.withDraw(500.08);
    	googleFirstAccount.transfer(220, google.getAccounts().get(1));
        System.out.printf("Final balance: $ %.2f", googleFirstAccount.getBalance());
        System.out.println( "Thank you!" );
    }
}
