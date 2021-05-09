package vafilonov.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;

public abstract class ConfigBase extends Configured implements Tool {
    static {
        Configuration.addDefaultResource("hdfs-site.xml");
        Configuration.addDefaultResource("core-site.xml");
    }
}
