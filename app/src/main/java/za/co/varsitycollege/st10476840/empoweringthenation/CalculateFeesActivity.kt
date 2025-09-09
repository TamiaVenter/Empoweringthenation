package za.co.varsitycollege.st10476840.empoweringthenation

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalculateFeesActivity : AppCompatActivity() {
    private val courses = mapOf(
        "First Aid" to 1500,
        "Sewing" to 1500,
        "Landscaping" to 1500,
        "Life Skills" to 1500,
        "Child Minding" to 750,
        "Cooking" to 750,
        "Garden Maintenance" to 750
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_fees)
        // checkboxes
        val cbFirstAid = findViewById<CheckBox>(R.id.cbFirstAid)
        val cbSewing = findViewById<CheckBox>(R.id.cbSewing)
        val cbLandscaping = findViewById<CheckBox>(R.id.cbLandScapping)
        val cbLifeSkills = findViewById<CheckBox>(R.id.cbLifeSkills)
        val cbChildMinding = findViewById<CheckBox>(R.id.cbChildMinding)
        val cbCooking = findViewById<CheckBox>(R.id.cbCooking)
        val cbGardenMaintenance = findViewById<CheckBox>(R.id.cbGardenMaintenance)

        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener {
            var total = 0
            var count = 0

            if (cbFirstAid.isChecked) { total += 1500; count++ }
            if (cbSewing.isChecked) { total += 1500; count++ }
            if (cbLandscaping.isChecked) { total += 1500; count++ }
            if (cbLifeSkills.isChecked) { total += 1500; count++ }
            if (cbChildMinding.isChecked) { total += 750; count++ }
            if (cbCooking.isChecked) { total += 750; count++ }
            if (cbGardenMaintenance.isChecked) { total += 750; count++ }

            // apply discount
            val discount = when (count) {
                2 -> 0.05
                3 -> 0.10
                in 4..10 -> 0.15
                else -> 0.0
            }

            val discounted = total - (total * discount)
            val vat = discounted * 0.15
            val finalTotal = discounted + vat

            tvResult.text = "Courses selected: $count\n" +
                    "Subtotal: R$total\n" +
                    "Discount: ${(discount * 100).toInt()}%\n" +
                    "VAT (15%): R${"%.2f".format(vat)}\n" +
                    "Total: R${"%.2f".format(finalTotal)}"
        }
    }
}
