import io.github.pixee.security.BoundedLineReader;
import java.io.*;

class DemonetizationException extends Exception
{
    private double amt;
    DemonetizationException(double amt)
    {
        this.amt = amt;
    }

    public String exMessage()
    {
        return ("Exception as either you are depositing  Old currency of Rs. " + amt + " or amount crosses Rs. 5,000 and cannot be Deposited");
    }
}

public class Customer
{
    public static void main(String[] args) throws IOException, DemonetizationException
    {
        Account newac;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch = 0;
        System.out.println("Create account with: ");
        System.out.println("1. Minimum balance of 500");
        System.out.println("2. Custom balance of your choice should be atleast 500");
        System.out.print("Enter choice: ");
        ch = Integer.parseInt(BoundedLineReader.readLine(br, 5_000_000));

        if(ch == 1)
        {
            newac = new Account();
        }
        else if(ch == 2)
        {
            System.out.print("Enter starting balance: ");
            double bal = Double.parseDouble(BoundedLineReader.readLine(br, 5_000_000));
            if(bal >= 500)
            {
                newac = new Account(bal);
            }
            else
            {
                System.out.println("Sorry, balance cannot be less than Rs. 500. Creating account with minimum balance...");
                newac = new Account();
            }
        }
        else
        {
            System.out.println("Sorry, wrong option chosen. Creating account with minimum balance...");
            newac = new Account();
        }

        while(true)
        {
            System.out.println("MENU:");
            System.out.println("1. Check account balance");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = Integer.parseInt(BoundedLineReader.readLine(br, 5_000_000));

            if(ch == 1)
            {
                System.out.println("Your current account balance is: " + newac.currBalance());
                System.out.println("\n");
            }
            else if(ch == 2)
            {
                System.out.print("Enter amount to deposit: ");
                double toDep = Double.parseDouble(BoundedLineReader.readLine(br, 5_000_000));
                System.out.print("Enter type of currency - OLD/NEW: ");
                String curType = BoundedLineReader.readLine(br, 5_000_000);
                try
                {
                    newac.deposit(toDep, curType);
                }
                catch(DemonetizationException de)
                {
                    System.out.println(de.exMessage());
                }
                System.out.println("\n");
            }
            else if(ch == 3)
            {
                System.out.print("Enter amount to withdraw: ");
                double toWith = Double.parseDouble(BoundedLineReader.readLine(br, 5_000_000));
                newac.withdraw(toWith);
                System.out.println("\n");
            }
            else if(ch == 4)
            {
                System.out.println("By, thank you for transition");
                break;
            }
            else
            {
                System.out.println("Wrong option chosen, please try again");
                System.out.println("\n");
            }
        }
    }
}







class Account
{
    private double bal;

    Account()
    {
        this.bal = 500.0;
    }

    Account(double bal)
    {
        this.bal = bal;
    }

    public void deposit(double amount, String currencyType) throws DemonetizationException
    {
        if((currencyType.equals("OLD")&&amount>500) || amount > 5000)
        {
            throw new DemonetizationException(amount);
        }
        else
        {
            bal += amount;
            System.out.println("Balance updated");
        }
    }

    public double currBalance()
    {
        return bal;
    }

    public void withdraw(double amount)
    {
        if(bal - amount >= 500)
        {
            bal -= amount;
            System.out.println("Balance updated");
        }
        else
        {
            System.out.println("Sorry, minimum balance cannot be breached");
            System.out.println("You must maintain a balance of 500");
        }
    }
}
