package com.manos.mypass.services;

import com.manos.mypass.enums.Language;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by manoskammas on 19/09/2018.
 */
@Service
public class PropertiesServiceImpl {

    @Value("${login.welcome.message.uk}")
    private String welcomeMessageUk;

    @Value("${login.welcome.message.gr}")
    private String welcomeMessageGr;


    @Value("${language.option.question.uk}")
    private String languageQuestionUk;
    //----------------------------------

    public PropertiesServiceImpl() {
    }


    //-----------------------------------------

    public String getWelcomeMessage(Language preferredLanguage) {
        switch (preferredLanguage) {
            case UK:
                return welcomeMessageUk;
            case GR:
                return welcomeMessageGr;
            default:
                return welcomeMessageUk;
        }
    }




    // @Value("#{'${bank.holidays.of.the.year}'.split(',')}")
    //private List<String> bankHolidaysList;


    /*public List<Date> getBankHolidaysList(){

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


        List<Date> holidays= new ArrayList();

//        for(String s:bankHolidaysList) {
//            holidays.add(sdf.parse(s));
//        }

        bankHolidaysList.forEach(s -> {
            try {
                holidays.add(sdf.parse(s));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });

        holidays.forEach(System.out::println);

        return holidays;
    }
*/



}
