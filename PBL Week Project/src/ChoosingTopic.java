import java.util.Scanner;

public class ChoosingTopic {
    public static void main(String[] args) {
        Topics PBXObject = new Topics();
        Topics VPNObject = new Topics();
        Topics IDSObject = new Topics();
        Topics IPSObject = new Topics();
        Topics LDWObject = new Topics();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("What would you like to learn?");
        System.out.println("Please input an option from the parenthesis\n" +
                "(PBX) Private Branch Exchange  |   (VPN) Virtual Private Network\n" +
                "(IS) Intrusion Detection System or Intrusion Prevention System | (LDW) Lock down Workstation");
        String selection = input.nextLine();
        if (selection.equals("PBX")){
            PBXObject.PBX();
        }
        if (selection.equals("VPN")){
            VPNObject.VPN();
        }
        if(selection.equals("IS")){
            Scanner input2 = new Scanner(System.in);
            System.out.println("Please select Intrusion systems\n" +
                    "(IDS) Intrusion Detection System    |   (IPS) Intrusion Prevention System");
            String selection2 = input2.nextLine();
            if (selection2.equals("IDS")){
                IDSObject.IDS();
            } else if (selection2.equals("IPS")){
                IPSObject.IPS();
            } else {
                System.out.println("Invalid selection");
            }
        }
        if(selection.equals("LDW")){
            LDWObject.LDW();
        }
    }
}
//Code was made by 7X-Z0 Github
