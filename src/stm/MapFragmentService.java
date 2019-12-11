package stm;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.io.IOException;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MapFragmentService {

    @WebMethod
    String getMapFragment(int x1, int y1, int x2, int y2) throws IOException;
}