package org.parse;
import org.parse.hazelcast.Cluster;
import org.parse.hazelcast.Parser;
import org.parse.hazelcast.THLParseListener;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {
@Inject 
Cluster hzcluster;
@Inject 
Parser parser;
@Inject
THLParseListener thlListener;
@Override
public int run(String... args) throws Exception {
hzcluster.createClient();
parser.consume();

return 0;
}



public static void main(String... args) {
Quarkus.run(Main.class, args);
}
}