package io.github.dnivra26.callreminder.model;

import android.net.Uri;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reminder {

    public enum Recurrence{
        DAILY, WEEKLY, FORTNIGHTLY
    }

    private Uri contactUri;
    private Date reminderDate;
    private Recurrence recurrence;


}
