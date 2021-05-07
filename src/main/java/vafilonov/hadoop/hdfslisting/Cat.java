package vafilonov.hadoop.hdfslisting;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.util.ToolRunner;

import java.net.URL;

public class Cat {

    static {
        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
    }

    public static void main(String[] args) throws Exception {
        int exit = ToolRunner.run(new CatConfiger(), args);
        System.exit(exit);
    }
}
