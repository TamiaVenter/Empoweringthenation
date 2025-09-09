package za.co.varsitycollege.st10476840.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val sixMonthBtn = findViewById<Button>(R.id.btnSixMonth)
        val sixWeekBtn = findViewById<Button>(R.id.btnSixWeek)
        val calcFeesBtn = findViewById<Button>(R.id.btnCalculateFees)
        val contactBtn = findViewById<Button>(R.id.btnContact)


                sixMonthBtn.setOnClickListener {
                    startActivity(Intent(this, SixMonthCourseActivity::class.java))
                }

                sixWeekBtn.setOnClickListener {
                    startActivity(Intent(this, SixWeekCourseActivity::class.java))
                }

                calcFeesBtn.setOnClickListener {
                    startActivity(Intent(this, CalculateFeesActivity::class.java))
                }

                contactBtn.setOnClickListener {
                    startActivity(Intent(this, ContactActivity::class.java))
                }
            }
        }
