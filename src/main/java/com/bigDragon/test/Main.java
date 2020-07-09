package com.bigDragon.test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bigDragon.demo.entity.User;
import com.bigDragon.demo.util.HttpClientUtil;
import com.bigDragon.demo.util.MD5;


public class Main {

	public void print(fruit f){
		f.appearance();
		f.property();
	}
    public static void main(String[] args) {
    	String[] array=new String[]{"1","2","3","4","5"};
	 	for(int i=0;i<array.length;i++){
	 		System.out.println(i);
			if(i!=array.length-1){
				System.out.println("or");
			}
	 	}
    }
}
