import java.util.Scanner;


public class student extends studentInfo {

        public static void main (String[] args){

            int size;
            Scanner input = new Scanner(System.in);
            System.out.println("Student Information");
            System.out.println("How many students:");
            size = input.nextInt();


            String FN;
            String LN;
            String PS ;
            int id ;
            String CS ;
            String Email ;
            String Address ;
            String City ;
            String State ;
            String ZC ;
            int zip ;



            do {
                System.out.println("First Name:");
                FN = input.nextLine();


            }
            while
            (!Name (FN));

            do {
                System.out.println("Last Name:");
                LN = input.nextLine();
            }
            while
            (!Name (LN));

            do {
                do {
                    System.out.println("Peoplesoft ID:");
                    PS = input.nextLine();
                }
                while
                (!PS (PS));
                id = Integer.parseInt(PS);
            }
            while
            (id <= 7);

            do {
                System.out.println("Class Standing:");
                CS = input.nextLine();
            }
            while
            (!CS (CS));


            do {
                System.out.println("Email ID:");
                Email = input.nextLine();
            }
            while
            (!Email (Email));

            do{
                System.out.println("Address Line 1:");
                Address = input.nextLine();
            }
            while
            (!Address (Address));

            do {
                System.out.println("City:");
                City = input.nextLine();
            }
            while
            (!City (City));

            do{
                System.out.println("State:");
                State = input.nextLine();
            }
            while
            (!State (State));

            do {
                do {
                    System.out.println("Zipcode:");
                    ZC = input.nextLine();
                }
                while
                (!ZC (ZC));
                zip = Integer.parseInt(ZC);
            }
            while
            (zip <= 9);

            System.out.println("Number of students:"+size);
        }

    private static boolean ZC (String ZC){
            if (ZC.matches("[0-9]{9}+"))
                return true;
            return false;
        }

    private static boolean City (String City){
            return ((City != null) && (!City.equals("")) && (City.matches("^[a-z A-Z]*$")));
        }
    private static boolean State (String State){
            if (State.matches("^[AK, AL, AR, AZ, CA, CO, CT, DC, DE, FL, GA, HI, IA, ID, IL, IN, KS, KY, LA, MA, MD, ME, MI, MN, MO, MS, MT, NC, ND, NE, NH, NJ, NM, NV, NY, OH, OK, OR, PA, RI, SC, SD, TN, TX, UT, VA, VT,\n" +
                    "WA, WI, WV, WY]*$"));
            return true;
    }

    private static boolean Email (String Email){
            if (Email.matches("^[a-z A-Z 1-9]+@[a-z A-Z 1-9]+.(com|edu|org)$"));
              return true;

        }
    public static boolean Address (String Address){
            if (Address.matches("^[1-9]+@[a-z A-Z]*$"));
            return true;
    }

    public static boolean CS (String CS){
            if
            (CS.equalsIgnoreCase("Freshman") || CS.equalsIgnoreCase("Sophomore") || CS.equalsIgnoreCase("Junior") || CS.equalsIgnoreCase("Senior"))
                return true;
            return false;
        }

    public static boolean Name (String Name){
            return ((Name != null) && (!Name.equals("")) && (Name.matches("^[a-z A-Z]*$")));
        }
    public static boolean PS (String PS){
            if
            (PS.matches("[0-9]+"))
                return true;
            return false;

        }

    }
