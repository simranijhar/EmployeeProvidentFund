package com.example.employeeprovidentfund

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c:Calendar = Calendar.getInstance()
        val mYear =c.get(Calendar.YEAR)
        val mMonth = c.get(Calendar.MONTH)
        val mDay = c.get(Calendar.DAY_OF_MONTH)

        date.setOnClickListener {
            val dpd = DatePickerDialog( this,

                DatePickerDialog.OnDateSetListener {
                        view, year, month, dayOfMonth ->
                    //Display selected data in text view
                    date.setText("%d-%d-%d".format(dayOfMonth, month, year))
                }, mYear, mMonth, mDay)
            dpd.show()
        }
    }
}
