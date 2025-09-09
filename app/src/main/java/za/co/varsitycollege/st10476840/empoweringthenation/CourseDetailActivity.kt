package za.co.varsitycollege.st10476840.empoweringthenation

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CourseDetailActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_course_detail)

        // Get the course name passed from previous screen
        val courseName = intent.getStringExtra("courseName")

        // Find UI elements
        val txtCourseName = findViewById<TextView>(R.id.txtCourseName)
        val txtCourseFees = findViewById<TextView>(R.id.txtCourseFees)
        val txtCoursePurpose = findViewById<TextView>(R.id.txtCoursePurpose)
        val txtCourseContent = findViewById<TextView>(R.id.txtCourseContent)

        //  Display the course details based on the name
        when (courseName) {
            "First Aid" -> {
                txtCourseName.text = "First Aid"
                txtCourseFees.text = "Fees: R1500"
                txtCoursePurpose.text = "Purpose: To provide first aid awareness and basic life support."
                txtCourseContent.text = """
                    • Wounds and bleeding
                    • Burns and fractures
                    • Emergency scene management
                    • CPR
                    • Respiratory distress (choking, blocked airway)
                """.trimIndent()
            }

            "Sewing" -> {
                txtCourseName.text = "Sewing"
                txtCourseFees.text = "Fees: R1500"
                txtCoursePurpose.text = "Purpose: To provide alterations and new garment tailoring services."
                txtCourseContent.text = """
                    • Types of stitches
                    • Threading a sewing machine
                    • Sewing buttons, zips, hems and seams
                    • Alterations
                    • Designing and sewing new garments
                """.trimIndent()
            }

            "Landscaping" -> {
                txtCourseName.text = "Landscaping"
                txtCourseFees.text = "Fees: R1500"
                txtCoursePurpose.text = "Purpose: To provide landscaping services for new and established gardens."
                txtCourseContent.text = """
                    • Indigenous and exotic plants and trees
                    • Fixed structures (fountains, benches, braai areas)
                    • Balancing of plants and trees
                    • Aesthetics of plant shapes and colours
                    • Garden layout
                """.trimIndent()
            }

            "Life Skills" -> {
                txtCourseName.text = "Life Skills"
                txtCourseFees.text = "Fees: R1500"
                txtCoursePurpose.text = "Purpose: To provide skills to navigate basic life necessities."
                txtCourseContent.text = """
                    • Opening a bank account
                    • Basic labour law (know your rights)
                    • Basic reading and writing literacy
                    • Basic numeric literacy
                """.trimIndent()
            }

            "Child Minding" -> {
                txtCourseName.text = "Child Minding"
                txtCourseFees.text = "Fees: R750"
                txtCoursePurpose.text = "Purpose: To provide basic child and baby care."
                txtCourseContent.text = """
                    • Birth to six-month old baby needs
                    • Seven-month to one year old needs
                    • Toddler needs
                    • Educational toys
                """.trimIndent()
            }

            "Cooking" -> {
                txtCourseName.text = "Cooking"
                txtCourseFees.text = "Fees: R750"
                txtCoursePurpose.text = "Purpose: To prepare and cook nutritious family meals."
                txtCourseContent.text = """
                    • Nutritional requirements for a healthy body
                    • Types of protein, carbohydrates and vegetables
                    • Planning meals
                    • Tasty and nutritious recipes
                    • Preparation and cooking of meals
                """.trimIndent()
            }

            "Garden Maintenance" -> {
                txtCourseName.text = "Garden Maintenance"
                txtCourseFees.text = "Fees: R750"
                txtCoursePurpose.text = "Purpose: To provide basic knowledge of watering, pruning and planting in a domestic garden."
                txtCourseContent.text = """
                    • Water restrictions and plant watering needs
                    • Pruning and propagation
                    • Planting techniques for different plant types
                """.trimIndent()
            }
        }
    }
}
