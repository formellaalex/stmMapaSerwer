package stm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.io.IOException;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MapFragmentService {

    @WebMethod
    String getMapFragment(
            @WebParam(name = "x1") int x1,
            @WebParam(name = "y1") int y1,
            @WebParam(name = "x2") int x2,
            @WebParam(name = "y2") int y2
    ) throws IOException;
}