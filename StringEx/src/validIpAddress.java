public class validIpAddress {

    public static void main(String[] str){
        String IP="120.0.0.1";
        validIpAddress(IP);
    }

    private static void validIpAddress(String IP){

        String[] ipaddress= IP.split("\\.");

//        System.out.print(" length is "+ ipaddress.length);


        if(ipaddress.length ==4){

            boolean isValid = false;

            for(String singleIp : ipaddress){

//                System.out.print(" here single IP is "+ singleIp);

                boolean result =(singleIp.matches("\\d+"));
//                System.out.print(" here result  is"+ result);

                boolean result2= Integer.parseInt(singleIp)<=255;
//                System.out.print(" here result 2 is"+ result2);

               if((singleIp.matches("\\d+")) && Integer.parseInt(singleIp)<=255){

//
                     isValid = true;
                }
               else{
                   System.out.print("this IP address is not valid either greater than 255 or not digit");
               }
            }

            if(isValid){
                System.out.print("this IP address is valid");
            }
        }
        else{
            System.out.print(" this IP also invalid !!!");
        }

    }
}
