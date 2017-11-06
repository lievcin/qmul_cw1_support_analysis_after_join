	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.net.URI;
	import java.util.Hashtable;
	import java.util.Iterator;
	import java.util.Set;

	import org.apache.hadoop.fs.FSDataInputStream;
	import org.apache.hadoop.fs.FileSystem;
	import org.apache.hadoop.fs.Path;
	import org.apache.hadoop.io.Text;
	import org.apache.hadoop.io.IntWritable;
	import org.apache.hadoop.mapreduce.Mapper;



	public class AthletesandSportsSupportMapper extends Mapper<TextPair, IntWritable, Text, IntWritable> {

    private Text data = new Text();

    public void map(TextPair key, IntWritable value, Context context) throws IOException, InterruptedException {

  		data.set(key.getFirst()); //athlete name
  		//data.set(key.getSecond()); //sport name
    	context.write(data, value);

    }

	}