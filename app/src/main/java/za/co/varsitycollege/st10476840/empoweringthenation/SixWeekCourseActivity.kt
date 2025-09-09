package za.co.varsitycollege.st10476840.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.gms.ads.mediation.Adapter

class SixWeekCourseActivity : AppCompatActivity() {
    private val courses = arrayOf("Child Minding", "Cooking", "Garden Maintenance")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_six_week_course)

        val listView = findViewById<ListView>(R.id.listSixWeek)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, courses)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, CourseDetailActivity::class.java)
            intent.putExtra("courseName", courses[position])
            startActivity(intent)
                }
            }
        }