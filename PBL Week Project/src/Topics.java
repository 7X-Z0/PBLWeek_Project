//using two java classes to organize code and separate the information of topics
public class Topics {
    public void PBX(){
        System.out.println("PBX or private branch exchange is a telephone system in a business that switches calls between users on local lines.\n"
                + "Businesses use these to cut costs on phone charges.\n"
                + "They used to be analog requiring a telephone operator, but now everything is done digitally.");
    }
    public void VPN(){
        System.out.println("VPN or virtual private is the extension of a private network in which data is encrypted when sending packets into public network.\n"
                + "VPNs increases privacy as the data is encrypted when sent in the network, making it hard for other unauthorized entities to steal data.\n"
                + "VPNs can be used by anyone, from businesses to regular people.");
    }
    public void IDS(){
        System.out.println("IDS or intrusion detection system is a software that monitors a network for malicious activity.\n"
                + "This can range from viruses to policy violations.\n"
                + "They can come Signature-based or Anomaly-Based.\n"
                + "Signature-based IDS detects possible threats by looking for specific patterns, such as byte sequences in network traffic, or known malicious instruction sequences used by malware.\n"
                + "Anomaly-based IDS uses machine learning to create a defined model of trustworthy activity, and then compare new behavior against this trust model.");
    }
    public void IPS(){
        System.out.println("IPS or intrusion production system is a software that works along an IDS that prevents malicious activity.\n"
                + "IPS automatically handles the malicious activity when triggered.\n"
                + "This can include\n" +
                "-Sending an alarm to the administrator\n" +
                "-Dropping the malicious packets\n" +
                "-Blocking traffic from the source address\n" +
                "-Resetting the connection");
    }
    public void LDW(){
        System.out.println("Securing work stations (in businesses) can be done in a verity of ways:\n" +
                "Restricting the use of internet access allows the employer to ensure that employees don't install malicious software\n" +
                "Banning certain software such as personal emails, reduce the likelihood of a cyber-attack through an employee to occur.\n" +
                "Installing a firewall such as an IPS or IDS (see other options to learn about them) gives the workstation a way to fight back in case a software does breach it.\n" +
                "Lastly locking restricts the possibility of an outside person to be able to steal data if they were to try to steal it physically from a workstation or server room.");
    }
}
