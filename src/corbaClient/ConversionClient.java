package corbaClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import corbaConversion.IConversionRemote;
import corbaConversion.IConversionRemoteHelper;

public class  ConversionClient {

    public static void main(String[] args) {
        try {
            Context ctx = new InitialContext();
            java.lang.Object ref = ctx.lookup("OD");
            IConversionRemote stub = IConversionRemoteHelper.narrow((org.omg.CORBA.Object) ref);// recuperer stub
            System.out.println(stub.conversionMontant(70.00));
            System.out.println(stub.conversionMontant(1500.00));
        } catch (NamingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}
