package com.dp.behavioural.c.chain_of_resp.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoEx {

	public static void main(String[] args) {
		// ex handing chain of resp design
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("foo.ser")));
		} catch (FileNotFoundException ex) {

		} catch (IOException ex) {

		} catch (Exception ex) {

		}
	}
}
