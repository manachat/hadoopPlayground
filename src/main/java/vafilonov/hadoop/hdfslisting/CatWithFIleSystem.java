package vafilonov.hadoop.hdfslisting;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class CatWithFIleSystem {

    public static void main(String[] args) throws Exception {
        final String uri = args[0];
        Configuration config = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(uri), config);
        System.out.println(config.get("dfs.namenode.name.dir"));
        InputStream in = null;
        try {
            in = fs.open(new Path(uri));
            IOUtils.copyBytes(in, System.out, 4096, false);
        } finally {
            IOUtils.closeStream(in);
        }
    }
}
