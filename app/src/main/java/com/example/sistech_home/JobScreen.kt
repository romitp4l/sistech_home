package com.example.sistech_home


import androidx.compose.runtime.Composable
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun JobScreen() {

    Column {
        Column {
            // Add this
            LazyColumn(
                modifier = Modifier.fillMaxSize().weight(1f)
            ) {
                items(listOf(mockJob, contentWriterJob, frontEndDevJob, marketingManagerJob, mockJob)) { job ->
                    JobListingScreen(job)
                    Divider(modifier = Modifier.padding(top = 16.dp, bottom = 8.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
        }


//
//        JobListingScreen(mockJob)
//        Spacer(modifier = Modifier.height(20.dp))
//        JobListingScreen(contentWriterJob)
//        Spacer(modifier = Modifier.height(20.dp))
//        JobListingScreen(frontEndDevJob)
//        Spacer(modifier = Modifier.height(20.dp))
//        JobListingScreen(marketingManagerJob)
//        Spacer(modifier = Modifier.height(20.dp))
//        JobListingScreen(mockJob)
    }




}



// Replace with your actual data model
data class JobListing(val title: String, val company: String, val location: String, val description: String)

// Mock data for preview
val mockJob = JobListing(
    title = "Software Engineer",
    company = "romitp4l tech limited",
    location = "Remote",
    description = "Develop innovative features for our cloud platform..."
)


val contentWriterJob = JobListing(
    title = "Content Writer",
    company = "Storytellers Inc.",
    location = "Remote",
    description = "Create engaging and informative blog posts, website content, and marketing materials, research industry trends, and maintain brand voice..."
)

val frontEndDevJob = JobListing(
    title = "Front-End Developer",
    company = "Pixel Perfect",
    location = "London, UK",
    description = "Develop and maintain responsive web applications using React and other modern technologies, write clean and maintainable code, and collaborate with designers..."
)


val marketingManagerJob = JobListing(
    title = "Marketing Manager",
    company = "Growth Hackers",
    location = "Full-time remote (US)",
    description = "Develop and execute marketing campaigns, manage social media presence, analyze marketing data, and drive brand awareness..."
)

@Composable
fun JobListingScreen(job: JobListing) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {
        Image(
            painter = painterResource(id = R.drawable.sample2),
            contentDescription = job.company,
            modifier = Modifier
                .width(400.dp)
                .height(200.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = job.title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = job.company,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = job.location,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = job.description,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(
            onClick = { /* Handle apply action */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Apply Now")
        }
    }
}


// preview

@Preview(showBackground = true)
@Composable
fun JobListingScreenPreview() {
    JobListingScreen(mockJob)
}





