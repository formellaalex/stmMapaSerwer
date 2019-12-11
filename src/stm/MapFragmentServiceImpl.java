package stm;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

@WebService(endpointInterface = "stm.MapFragmentService", targetNamespace = "stmMapa")
public class MapFragmentServiceImpl implements MapFragmentService {

    @Override
    public String getMapFragment(int x1, int y1, int x2, int y2) throws IOException {
        InputStream inputStream = MapFragmentServiceImpl.class.getResourceAsStream("/zakopane.png");
        BufferedImage mapFragment = ImageIO
                .read(inputStream)
                .getSubimage(x1, y1, x2, y2);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(mapFragment, "png", baos );
        baos.flush();
        byte[] mapFragmentBytes = baos.toByteArray();
        baos.close();
        return Base64.getEncoder().encodeToString(mapFragmentBytes);
    }
}
