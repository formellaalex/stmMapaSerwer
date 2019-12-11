package stm;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

@WebService(endpointInterface = "stm.MapFragmentService", targetNamespace = "stmMapa")
public class MapFragmentServiceImpl implements MapFragmentService {

    @Override
    public String getMapFragment(int x1, int y1, int x2, int y2) throws IOException {
//        BufferedImage mapFragment = ImageIO
//                .read(new File("resources/zakopane.png"))
//                .getSubimage(x1, y1, x2, y2);
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ImageIO.write(mapFragment, "png", baos );
//        baos.flush();
//        byte[] mapFragmentBytes = baos.toByteArray();
//        baos.close();
//        return Base64.getEncoder().encodeToString(mapFragmentBytes);
        return "TU POWINIEN BYC BASE64";
    }
}
