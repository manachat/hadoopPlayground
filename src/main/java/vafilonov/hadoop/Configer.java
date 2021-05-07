package vafilonov.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class Configer extends Configured implements Tool {
    static {
        try {
            Files.walk(Paths.get("hadoop-config")).forEach((p) -> Configuration.addDefaultResource(p.toString()));
        } catch (IOException ioex) {
            System.err.println("Failed loading config");
            ioex.printStackTrace();
            System.exit(-1);
        }
    }

}
