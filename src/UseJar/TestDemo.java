package UseJar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import LicensePlateLocation.LicensePlateLocation;

public class TestDemo {
	public static void main(String[] args) throws Exception {
		String detect_folder = "./data/test_dataset/plate_set1/";
		String output_folder = "./data/test_dataset/detect_result/";
		String suffix = "*.jpg";
		int status_code = 0;

		System.out.println("Java Jar Demo");
		// 构造license_plate_location的输入输出参数,参数类型参照编译完成的文档
		// doc文件夹内的文档对LicensePlateLocation类有详细的说明
		LicensePlateLocation liLicensePlateLocation = new LicensePlateLocation();
		List<String> inputs = new ArrayList<String>(Arrays.asList(detect_folder, suffix, output_folder));

		List<Integer> results = new ArrayList<Integer>();
		results.add(status_code);
		liLicensePlateLocation.license_plate_location(results, inputs);

		System.out.println("license plate location return status code is: " + results);
	}
}
