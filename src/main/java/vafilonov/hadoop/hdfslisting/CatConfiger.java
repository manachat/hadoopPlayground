package vafilonov.hadoop.hdfslisting;

import org.apache.hadoop.io.IOUtils;
import vafilonov.hadoop.Configer;

import java.io.InputStream;
import java.net.URL;

public class CatConfiger extends Configer {

    @Override
    public int run(String[] strings) throws Exception {
        InputStream in = null;
        try {
            in = new URL(strings[0]).openStream();
            IOUtils.copyBytes(in, System.out, 4096, false);
        } finally {
            IOUtils.closeStream(in);
        }
        return 0;
    }
}
