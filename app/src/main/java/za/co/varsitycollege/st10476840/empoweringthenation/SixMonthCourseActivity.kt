package za.co.varsitycollege.st10476840.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SixMonthCourseActivity : AppCompatActivity() {
    private val courses = arrayOf("First Aid", "Sewing", "Landscaping", "Life Skills")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_six_month_course)

                val listView = findViewById<ListView>(R.id.listSixMonth)
                val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, courses)
                listView.adapter = adapter

                listView.setOnItemClickListener { _, _, position, _ ->
                    val intent = Intent (this, CourseDetailActivity::class.java)
                    intent.putExtra("courseName", courses[position])
                    startActivity(intent)
                }
            }
        }
