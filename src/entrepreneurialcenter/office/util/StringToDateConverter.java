package entrepreneurialcenter.office.util;
/**
 * 时锟斤拷锟绞阶拷锟斤拷啵拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date> {
	private String dataPattern;
	public StringToDateConverter(String dataPattern) {
    	super();
    	this.dataPattern=dataPattern;
    }
	@Override
	public Date convert(String s) {
		// TODO Auto-generated method stub
		Date date=null;
		try {
			date=new SimpleDateFormat(dataPattern).parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
}
