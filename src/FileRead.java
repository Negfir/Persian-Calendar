
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author applenegin
 */
public class FileRead {

    String day;
    String note;

    public FileRead() {

        // day="رویدادی یافت نشد";
    }

    /**
     * this method convert english date to persian
     *
     * @param month
     * @param num
     * @return persian format of date
     */
    public String NameConvert(int month, int num) {
        String day = null;
        if (month == 2) {

            switch (num) {
                case 1:
                    day = "۱ اردیبهشت";
                    break;
                case 2:
                    day = "۲ اردیبهشت";
                    break;
                case 3:
                    day = "۳ اردیبهشت";
                    break;
                case 4:
                    day = "۴ اردیبهشت";
                    break;
                case 5:
                    day = "۵ اردیبهشت";
                    break;
                case 6:
                    day = "۶ اردیبهشت";
                    break;
                case 7:
                    day = "۷ اردیبهشت";
                    break;
                case 8:
                    day = "۸ اردیبهشت";
                    break;
                case 9:
                    day = "۹ اردیبهشت";
                    break;
                case 10:
                    day = "۱۰ اردیبهشت";
                    break;
                case 11:
                    day = "۱۱ اردیبهشت";
                    break;
                case 12:
                    day = "۱۲ اردیبهشت";
                    break;
                case 13:
                    day = "۱۳ اردیبهشت";
                    break;
                case 14:
                    day = "۱۴ اردیبهشت";
                    break;
                case 15:
                    day = "۱۵ اردیبهشت";
                    break;
                case 16:
                    day = "۱۶ اردیبهشت";
                    break;
                case 17:
                    day = "۱۷ اردیبهشت";
                    break;
                case 18:
                    day = "۱۸ اردیبهشت";
                    break;
                case 19:
                    day = "۱۹ اردیبهشت";
                    break;
                case 20:
                    day = "۲۰ اردیبهشت";
                    break;
                case 21:
                    day = "۲۱ اردیبهشت";
                    break;
                case 22:
                    day = "۲۲ اردیبهشت";
                    break;
                case 23:
                    day = "۲۳ اردیبهشت";
                    break;
                case 24:
                    day = "۲۴ اردیبهشت";
                    break;
                case 25:
                    day = "۲۵ اردیبهشت";
                    break;
                case 26:
                    day = "۲۶ اردیبهشت";
                    break;
                case 27:
                    day = "۲۷ اردیبهشت";
                    break;
                case 28:
                    day = "۲۸ اردیبهشت";
                    break;
                case 29:
                    day = "۲۹ اردیبهشت";
                    break;
                case 30:
                    day = "۳۰ اردیبهشت";
                    break;
                case 31:
                    day = "۳۱ اردیبهشت";
                    break;
            }

        } else if (month == 1) {

            switch (num) {
                case 1:
                    day = "۱ فروردین";
                    break;
                case 2:
                    day = "۲ فروردین";
                    break;
                case 3:
                    day = "۳ فروردین";
                    break;
                case 4:
                    day = "۴ فروردین";
                    break;
                case 5:
                    day = "۵ فروردین";
                    break;
                case 6:
                    day = "۶ فروردین";
                    break;
                case 7:
                    day = "۷ فروردین";
                    break;
                case 8:
                    day = "۸ فروردین";
                    break;
                case 9:
                    day = "۹ فروردین";
                    break;
                case 10:
                    day = "۱۰ فروردین";
                    break;
                case 11:
                    day = "۱۱ فروردین";
                    break;
                case 12:
                    day = "۱۲ فروردین";
                    break;
                case 13:
                    day = "۱۳ فروردین";
                    break;
                case 14:
                    day = "۱۴ فروردین";
                    break;
                case 15:
                    day = "۱۵ فروردین";
                    break;
                case 16:
                    day = "۱۶ فروردین";
                    break;
                case 17:
                    day = "۱۷ فروردین";
                    break;
                case 18:
                    day = "۱۸ فروردین";
                    break;
                case 19:
                    day = "۱۹ فروردین";
                    break;
                case 20:
                    day = "۲۰ فروردین";
                    break;
                case 21:
                    day = "۲۱ فروردین";
                    break;
                case 22:
                    day = "۲۲ فروردین";
                    break;
                case 23:
                    day = "۲۳ فروردین";
                    break;
                case 24:
                    day = "۲۴ فروردین";
                    break;
                case 25:
                    day = "۲۵ فروردین";
                    break;
                case 26:
                    day = "۲۶ فروردین";
                    break;
                case 27:
                    day = "۲۷ فروردین";
                    break;
                case 28:
                    day = "۲۸ فروردین";
                    break;
                case 29:
                    day = "۲۹ فروردین";
                    break;
                case 30:
                    day = "۳۰ فروردین";
                    break;
                case 31:
                    day = "۳۱ فروردین";
                    break;
            }

        } else if (month == 3) {

            switch (num) {
                case 1:
                    day = "۱ خرداد";
                    break;
                case 2:
                    day = "۲ خرداد";
                    break;
                case 3:
                    day = "۳ خرداد";
                    break;
                case 4:
                    day = "۴ خرداد";
                    break;
                case 5:
                    day = "۵ خرداد";
                    break;
                case 6:
                    day = "۶ خرداد";
                    break;
                case 7:
                    day = "۷ خرداد";
                    break;
                case 8:
                    day = "۸ خرداد";
                    break;
                case 9:
                    day = "۹ خرداد";
                    break;
                case 10:
                    day = "۱۰ خرداد";
                    break;
                case 11:
                    day = "۱۱ خرداد";
                    break;
                case 12:
                    day = "۱۲ خرداد";
                    break;
                case 13:
                    day = "۱۳ خرداد";
                    break;
                case 14:
                    day = "۱۴ خرداد";
                    break;
                case 15:
                    day = "۱۵ خرداد";
                    break;
                case 16:
                    day = "۱۶ خرداد";
                    break;
                case 17:
                    day = "۱۷ خرداد";
                    break;
                case 18:
                    day = "۱۸ خرداد";
                    break;
                case 19:
                    day = "۱۹ خرداد";
                    break;
                case 20:
                    day = "۲۰ خرداد";
                    break;
                case 21:
                    day = "۲۱ خرداد";
                    break;
                case 22:
                    day = "۲۲ خرداد";
                    break;
                case 23:
                    day = "۲۳ خرداد";
                    break;
                case 24:
                    day = "۲۴ خرداد";
                    break;
                case 25:
                    day = "۲۵ خرداد";
                    break;
                case 26:
                    day = "۲۶ خرداد";
                    break;
                case 27:
                    day = "۲۷ خرداد";
                    break;
                case 28:
                    day = "۲۸ خرداد";
                    break;
                case 29:
                    day = "۲۹ خرداد";
                    break;
                case 30:
                    day = "۳۰ خرداد";
                    break;
                case 31:
                    day = "۳۱ خرداد";
                    break;
            }

        } else if (month == 4) {

            switch (num) {
                case 1:
                    day = "۱ تیر";
                    break;
                case 2:
                    day = "۲ تیر";
                    break;
                case 3:
                    day = "۳ تیر";
                    break;
                case 4:
                    day = "۴ تیر";
                    break;
                case 5:
                    day = "۵ تیر";
                    break;
                case 6:
                    day = "۶ تیر";
                    break;
                case 7:
                    day = "۷ تیر";
                    break;
                case 8:
                    day = "۸ تیر";
                    break;
                case 9:
                    day = "۹ تیر";
                    break;
                case 10:
                    day = "۱۰ تیر";
                    break;
                case 11:
                    day = "۱۱ تیر";
                    break;
                case 12:
                    day = "۱۲ تیر";
                    break;
                case 13:
                    day = "۱۳ تیر";
                    break;
                case 14:
                    day = "۱۴ تیر";
                    break;
                case 15:
                    day = "۱۵ تیر";
                    break;
                case 16:
                    day = "۱۶ تیر";
                    break;
                case 17:
                    day = "۱۷ تیر";
                    break;
                case 18:
                    day = "۱۸ تیر";
                    break;
                case 19:
                    day = "۱۹ تیر";
                    break;
                case 20:
                    day = "۲۰ تیر";
                    break;
                case 21:
                    day = "۲۱ تیر";
                    break;
                case 22:
                    day = "۲۲ تیر";
                    break;
                case 23:
                    day = "۲۳ تیر";
                    break;
                case 24:
                    day = "۲۴ تیر";
                    break;
                case 25:
                    day = "۲۵ تیر";
                    break;
                case 26:
                    day = "۲۶ تیر";
                    break;
                case 27:
                    day = "۲۷ تیر";
                    break;
                case 28:
                    day = "۲۸ تیر";
                    break;
                case 29:
                    day = "۲۹ تیر";
                    break;
                case 30:
                    day = "۳۰ تیر";
                    break;
                case 31:
                    day = "۳۱ تیر";
                    break;
            }

        } else if (month == 5) {

            switch (num) {
                case 1:
                    day = "۱ مرداد";
                    break;
                case 2:
                    day = "۲ مرداد";
                    break;
                case 3:
                    day = "۳ مرداد";
                    break;
                case 4:
                    day = "۴ مرداد";
                    break;
                case 5:
                    day = "۵ مرداد";
                    break;
                case 6:
                    day = "۶ مرداد";
                    break;
                case 7:
                    day = "۷ مرداد";
                    break;
                case 8:
                    day = "۸ مرداد";
                    break;
                case 9:
                    day = "۹ مرداد";
                    break;
                case 10:
                    day = "۱۰ مرداد";
                    break;
                case 11:
                    day = "۱۱ مرداد";
                    break;
                case 12:
                    day = "۱۲ مرداد";
                    break;
                case 13:
                    day = "۱۳ مرداد";
                    break;
                case 14:
                    day = "۱۴ مرداد";
                    break;
                case 15:
                    day = "۱۵ مرداد";
                    break;
                case 16:
                    day = "۱۶ مرداد";
                    break;
                case 17:
                    day = "۱۷ مرداد";
                    break;
                case 18:
                    day = "۱۸ مرداد";
                    break;
                case 19:
                    day = "۱۹ مرداد";
                    break;
                case 20:
                    day = "۲۰ مرداد";
                    break;
                case 21:
                    day = "۲۱ مرداد";
                    break;
                case 22:
                    day = "۲۲ مرداد";
                    break;
                case 23:
                    day = "۲۳ مرداد";
                    break;
                case 24:
                    day = "۲۴ مرداد";
                    break;
                case 25:
                    day = "۲۵ مرداد";
                    break;
                case 26:
                    day = "۲۶ مرداد";
                    break;
                case 27:
                    day = "۲۷ مرداد";
                    break;
                case 28:
                    day = "۲۸ مرداد";
                    break;
                case 29:
                    day = "۲۹ مرداد";
                    break;
                case 30:
                    day = "۳۰ مرداد";
                    break;
                case 31:
                    day = "۳۱ مرداد";
                    break;
            }

        } else if (month == 6) {

            switch (num) {
                case 1:
                    day = "۱ شهریور";
                    break;
                case 2:
                    day = "۲ شهریور";
                    break;
                case 3:
                    day = "۳ شهریور";
                    break;
                case 4:
                    day = "۴ شهریور";
                    break;
                case 5:
                    day = "۵ شهریور";
                    break;
                case 6:
                    day = "۶ شهریور";
                    break;
                case 7:
                    day = "۷ شهریور";
                    break;
                case 8:
                    day = "۸ شهریور";
                    break;
                case 9:
                    day = "۹ شهریور";
                    break;
                case 10:
                    day = "۱۰ شهریور";
                    break;
                case 11:
                    day = "۱۱ شهریور";
                    break;
                case 12:
                    day = "۱۲ شهریور";
                    break;
                case 13:
                    day = "۱۳ شهریور";
                    break;
                case 14:
                    day = "۱۴ شهریور";
                    break;
                case 15:
                    day = "۱۵ شهریور";
                    break;
                case 16:
                    day = "۱۶ شهریور";
                    break;
                case 17:
                    day = "۱۷ شهریور";
                    break;
                case 18:
                    day = "۱۸ شهریور";
                    break;
                case 19:
                    day = "۱۹ شهریور";
                    break;
                case 20:
                    day = "۲۰ شهریور";
                    break;
                case 21:
                    day = "۲۱ شهریور";
                    break;
                case 22:
                    day = "۲۲ شهریور";
                    break;
                case 23:
                    day = "۲۳ شهریور";
                    break;
                case 24:
                    day = "۲۴ شهریور";
                    break;
                case 25:
                    day = "۲۵ شهریور";
                    break;
                case 26:
                    day = "۲۶ شهریور";
                    break;
                case 27:
                    day = "۲۷ شهریور";
                    break;
                case 28:
                    day = "۲۸ شهریور";
                    break;
                case 29:
                    day = "۲۹ شهریور";
                    break;
                case 30:
                    day = "۳۰ شهریور";
                    break;
                case 31:
                    day = "۳۱ شهریور";
                    break;
            }

        } else if (month == 7) {

            switch (num) {
                case 1:
                    day = "۱ مهر";
                    break;
                case 2:
                    day = "۲ مهر";
                    break;
                case 3:
                    day = "۳ مهر";
                    break;
                case 4:
                    day = "۴ مهر";
                    break;
                case 5:
                    day = "۵ مهر";
                    break;
                case 6:
                    day = "۶ مهر";
                    break;
                case 7:
                    day = "۷ مهر";
                    break;
                case 8:
                    day = "۸ مهر";
                    break;
                case 9:
                    day = "۹ مهر";
                    break;
                case 10:
                    day = "۱۰ مهر";
                    break;
                case 11:
                    day = "۱۱ مهر";
                    break;
                case 12:
                    day = "۱۲ مهر";
                    break;
                case 13:
                    day = "۱۳ مهر";
                    break;
                case 14:
                    day = "۱۴ مهر";
                    break;
                case 15:
                    day = "۱۵ مهر";
                    break;
                case 16:
                    day = "۱۶ مهر";
                    break;
                case 17:
                    day = "۱۷ مهر";
                    break;
                case 18:
                    day = "۱۸ مهر";
                    break;
                case 19:
                    day = "۱۹ مهر";
                    break;
                case 20:
                    day = "۲۰ مهر";
                    break;
                case 21:
                    day = "۲۱ مهر";
                    break;
                case 22:
                    day = "۲۲ مهر";
                    break;
                case 23:
                    day = "۲۳ مهر";
                    break;
                case 24:
                    day = "۲۴ مهر";
                    break;
                case 25:
                    day = "۲۵ مهر";
                    break;
                case 26:
                    day = "۲۶ مهر";
                    break;
                case 27:
                    day = "۲۷ مهر";
                    break;
                case 28:
                    day = "۲۸ مهر";
                    break;
                case 29:
                    day = "۲۹ مهر";
                    break;
                case 30:
                    day = "۳۰ مهر";
                    break;

            }

        } else if (month == 8) {
            switch (num) {
                case 1:
                    day = "۱ آبان";
                    break;
                case 2:
                    day = "۲ آبان";
                    break;
                case 3:
                    day = "۳ آبان";
                    break;
                case 4:
                    day = "۴ آبان";
                    break;
                case 5:
                    day = "۵ آبان";
                    break;
                case 6:
                    day = "۶ آبان";
                    break;
                case 7:
                    day = "۷ آبان";
                    break;
                case 8:
                    day = "۸ آبان";
                    break;
                case 9:
                    day = "۹ آبان";
                    break;
                case 10:
                    day = "۱۰ آبان";
                    break;
                case 11:
                    day = "۱۱ آبان";
                    break;
                case 12:
                    day = "۱۲ آبان";
                    break;
                case 13:
                    day = "۱۳ آبان";
                    break;
                case 14:
                    day = "۱۴ خرداد";
                    break;
                case 15:
                    day = "۱۵ آبان";
                    break;
                case 16:
                    day = "۱۶ آبان";
                    break;
                case 17:
                    day = "۱۷ آبان";
                    break;
                case 18:
                    day = "۱۸ آبان";
                    break;
                case 19:
                    day = "۱۹ آبان";
                    break;
                case 20:
                    day = "۲۰ آبان";
                    break;
                case 21:
                    day = "۲۱ آبان";
                    break;
                case 22:
                    day = "۲۲ آبان";
                    break;
                case 23:
                    day = "۲۳ آبان";
                    break;
                case 24:
                    day = "۲۴ آبان";
                    break;
                case 25:
                    day = "۲۵ آبان";
                    break;
                case 26:
                    day = "۲۶ آبان";
                    break;
                case 27:
                    day = "۲۷ آبان";
                    break;
                case 28:
                    day = "۲۸ آبان";
                    break;
                case 29:
                    day = "۲۹ آبان";
                    break;
                case 30:
                    day = "۳۰ آبان";
                    break;

            }

        } else if (month == 9) {

            switch (num) {
                case 1:
                    day = "۱ آذر";
                    break;
                case 2:
                    day = "۲ آذر";
                    break;
                case 3:
                    day = "۳ آذر";
                    break;
                case 4:
                    day = "۴ آذر";
                    break;
                case 5:
                    day = "۵ آذر";
                    break;
                case 6:
                    day = "۶ آذر";
                    break;
                case 7:
                    day = "۷ آذر";
                    break;
                case 8:
                    day = "۸ آذر";
                    break;
                case 9:
                    day = "۹ آذر";
                    break;
                case 10:
                    day = "۱۰ آذر";
                    break;
                case 11:
                    day = "۱۱ آذر";
                    break;
                case 12:
                    day = "۱۲ آذر";
                    break;
                case 13:
                    day = "۱۳ آذر";
                    break;
                case 14:
                    day = "۱۴ آذر";
                    break;
                case 15:
                    day = "۱۵ آذر";
                    break;
                case 16:
                    day = "۱۶ آذر";
                    break;
                case 17:
                    day = "۱۷ آذر";
                    break;
                case 18:
                    day = "۱۸ آذر";
                    break;
                case 19:
                    day = "۱۹ آذر";
                    break;
                case 20:
                    day = "۲۰ آذر";
                    break;
                case 21:
                    day = "۲۱ آذر";
                    break;
                case 22:
                    day = "۲۲ آذر";
                    break;
                case 23:
                    day = "۲۳ آذر";
                    break;
                case 24:
                    day = "۲۴ آذر";
                    break;
                case 25:
                    day = "۲۵ آذر";
                    break;
                case 26:
                    day = "۲۶ آذر";
                    break;
                case 27:
                    day = "۲۷ آذر";
                    break;
                case 28:
                    day = "۲۸ آذر";
                    break;
                case 29:
                    day = "۲۹ آذر";
                    break;
                case 30:
                    day = "۳۰ آذر";
                    break;

            }

        } else if (month == 10) {

            switch (num) {
                case 1:
                    day = "۱ دی";
                    break;
                case 2:
                    day = "۲ دی";
                    break;
                case 3:
                    day = "۳ دی";
                    break;
                case 4:
                    day = "۴ دی";
                    break;
                case 5:
                    day = "۵ دی";
                    break;
                case 6:
                    day = "۶ دی";
                    break;
                case 7:
                    day = "۷ دی";
                    break;
                case 8:
                    day = "۸ دی";
                    break;
                case 9:
                    day = "۹ دی";
                    break;
                case 10:
                    day = "۱۰ دی";
                    break;
                case 11:
                    day = "۱۱ دی";
                    break;
                case 12:
                    day = "۱۲ دی";
                    break;
                case 13:
                    day = "۱۳ دی";
                    break;
                case 14:
                    day = "۱۴ دی";
                    break;
                case 15:
                    day = "۱۵ دی";
                    break;
                case 16:
                    day = "۱۶ دی";
                    break;
                case 17:
                    day = "۱۷ دی";
                    break;
                case 18:
                    day = "۱۸ دی";
                    break;
                case 19:
                    day = "۱۹ دی";
                    break;
                case 20:
                    day = "۲۰ دی";
                    break;
                case 21:
                    day = "۲۱ دی";
                    break;
                case 22:
                    day = "۲۲ دی";
                    break;
                case 23:
                    day = "۲۳ دی";
                    break;
                case 24:
                    day = "۲۴ دی";
                    break;
                case 25:
                    day = "۲۵ دی";
                    break;
                case 26:
                    day = "۲۶ دی";
                    break;
                case 27:
                    day = "۲۷ دی";
                    break;
                case 28:
                    day = "۲۸ دی";
                    break;
                case 29:
                    day = "۲۹ دی";
                    break;
                case 30:
                    day = "۳۰ دی";
                    break;

            }

        } else if (month == 11) {

            switch (num) {
                case 1:
                    day = "۱ بهمن";
                    break;
                case 2:
                    day = "۲ بهمن";
                    break;
                case 3:
                    day = "۳ بهمن";
                    break;
                case 4:
                    day = "۴ بهمن";
                    break;
                case 5:
                    day = "۵ بهمن";
                    break;
                case 6:
                    day = "۶ بهمن";
                    break;
                case 7:
                    day = "۷ بهمن";
                    break;
                case 8:
                    day = "۸ بهمن";
                    break;
                case 9:
                    day = "۹ بهمن";
                    break;
                case 10:
                    day = "۱۰ بهمن";
                    break;
                case 11:
                    day = "۱۱ بهمن";
                    break;
                case 12:
                    day = "۱۲ بهمن";
                    break;
                case 13:
                    day = "۱۳ بهمن";
                    break;
                case 14:
                    day = "۱۴ بهمن";
                    break;
                case 15:
                    day = "۱۵ بهمن";
                    break;
                case 16:
                    day = "۱۶ بهمن";
                    break;
                case 17:
                    day = "۱۷ بهمن";
                    break;
                case 18:
                    day = "۱۸ بهمن";
                    break;
                case 19:
                    day = "۱۹ بهمن";
                    break;
                case 20:
                    day = "۲۰ بهمن";
                    break;
                case 21:
                    day = "۲۱ بهمن";
                    break;
                case 22:
                    day = "۲۲ بهمن";
                    break;
                case 23:
                    day = "۲۳ بهمن";
                    break;
                case 24:
                    day = "۲۴ بهمن";
                    break;
                case 25:
                    day = "۲۵ بهمن";
                    break;
                case 26:
                    day = "۲۶ بهمن";
                    break;
                case 27:
                    day = "۲۷ بهمن";
                    break;
                case 28:
                    day = "۲۸ بهمن";
                    break;
                case 29:
                    day = "۲۹ بهمن";
                    break;
                case 30:
                    day = "۳۰ بهمن";

            }

        } else if (month == 12) {

            switch (num) {
                case 1:
                    day = "۱ اسفند";
                    break;
                case 2:
                    day = "۲ اسفند";
                    break;
                case 3:
                    day = "۳ اسفند";
                    break;
                case 4:
                    day = "۴ اسفند";
                    break;
                case 5:
                    day = "۵ اسفند";
                    break;
                case 6:
                    day = "۶ اسفند";
                    break;
                case 7:
                    day = "۷ اسفند";
                    break;
                case 8:
                    day = "۸ اسفند";
                    break;
                case 9:
                    day = "۹ اسفند";
                    break;
                case 10:
                    day = "۱۰ اسفند";
                    break;
                case 11:
                    day = "۱۱ اسفند";
                    break;
                case 12:
                    day = "۱۲ اسفند";
                    break;
                case 13:
                    day = "۱۳ اسفند";
                    break;
                case 14:
                    day = "۱۴ اسفند";
                    break;
                case 15:
                    day = "۱۵ اسفند";
                    break;
                case 16:
                    day = "۱۶ اسفند";
                    break;
                case 17:
                    day = "۱۷ اسفند";
                    break;
                case 18:
                    day = "۱۸ اسفند";
                    break;
                case 19:
                    day = "۱۹ اسفند";
                    break;
                case 20:
                    day = "۲۰ اسفند";
                    break;
                case 21:
                    day = "۲۱ اسفند";
                    break;
                case 22:
                    day = "۲۲ اسفند";
                    break;
                case 23:
                    day = "۲۳ اسفند";
                    break;
                case 24:
                    day = "۲۴ اسفند";
                    break;
                case 25:
                    day = "۲۵ اسفند";
                    break;
                case 26:
                    day = "۲۶ اسفند";
                    break;
                case 27:
                    day = "۲۷ اسفند";
                    break;
                case 28:
                    day = "۲۸ اسفند";
                    break;
                case 29:
                    day = "۲۹ اسفند";
                    break;
                case 30:
                    day = "۳۰ اسفند";
                    break;

            }

        }

        return day;
    }

    public String File(int a, int b) {

        String days = null;
        String line = null;

        try {

            FileReader fileReader
                    = new FileReader(NameConvert(a, b) + ".txt");

            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            if (line != null) {
                days = "<html>" + "<p align=\"right\">" + line;
                while ((line = bufferedReader.readLine()) != null) {

                    if (line.startsWith(NameConvert(a, b))) {
                        days = days + "<br>" + line;
                    }

                }
            } else {
                days = "<html>" + "<p align=\"left\">" + "رویدادی یافت نشد";
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + (NameConvert(a, b)) + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + (NameConvert(a, b)) + "'");
        }

        return days;
    }

    public void AddEvent(String event, int month, int day) {
        try {

            File file = new File(NameConvert(month, day) + ".txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(event);
            bw.newLine();
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void EditEvent(int month, int day, String event) {

        try {

            File file = new File(NameConvert(month, day) + ".txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(event);
            bw.newLine();
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method is use when we want to edit notes for each day
     *
     * @param month
     * @param day
     * @param note
     */
    public void EditNote(int month, int day, String note) {

        try {

            File file = new File(month + "_" + day + ".txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(note);
            bw.newLine();
            bw.flush();
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method is used when we add a new note to our calendar
     *
     * @param month
     * @param day
     * @param note
     */
    public void noteCreateFile(int month, int day, String note) {

        try {

            File file = new File(month + "_" + day + ".txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(note);
            bw.newLine();
            bw.flush();
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * this method is for reading notes from file
     *
     * @param month
     * @param day
     * @return
     */
    public String readNote(int month, int day) {
        String note = "یادداشت موجود نیست";
        String line = null;

        try {
            FileReader fileReader
                    = new FileReader(month + "_" + day + ".txt");

            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            if (line != null) {
                note = "<html>" + "<p align=\"right\">" + "یادداشت: " + "<br>" + line;
                while ((line = bufferedReader.readLine()) != null) {

                    note = note + "<br>" + line;

                }
            } else {
                note = "<p align=\"right\">" + "یادداشت موجود نیست";
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + day + "'");

        }

        return note;
    }

}
