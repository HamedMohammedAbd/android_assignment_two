package com.example.assigment_two.java;//package com.example.assigment_two.java;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.assigment_two.R;

public class login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
//import android.os.Bundle;
//import android.view.Gravity;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.content.ContextCompat;
//
//public class login_page extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//     // Main LinearLayout (Vertical)
//        LinearLayout mainLayout = new LinearLayout(this);
//        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//        mainLayout.setOrientation(LinearLayout.VERTICAL);
//        mainLayout.setBackgroundColor(ContextCompat.getColor(this, android.R.color.black)); // Black background
//
//        // Top Bar (LinearLayout Horizontal)
//        LinearLayout topBar = new LinearLayout(this);
//        topBar.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        topBar.setOrientation(LinearLayout.HORIZONTAL);
//        topBar.setPadding(16, 16, 16, 16); // Add padding
//
//        // "Open" TextView
//        TextView openText = new TextView(this);
//        openText.setText("Open");
//        openText.setTextColor(ContextCompat.getColor(this, android.R.color.white));
//        openText.setTextSize(20); // Adjust size as needed
//        LinearLayout.LayoutParams openParams = new LinearLayout.LayoutParams(
//                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1); // Weight to push to the left
//        openText.setLayoutParams(openParams);
//        topBar.addView(openText);
//
//        // Plus Icon (ImageView)
//        ImageView plusIcon = new ImageView(this);
//        plusIcon.setImageResource(android.R.drawable.ic_input_add); // Use appropriate icon
//        plusIcon.setColorFilter(ContextCompat.getColor(this, android.R.color.white));
//        topBar.addView(plusIcon);
//
//        mainLayout.addView(topBar);
//
//        // Places Label
//        TextView placesLabel = new TextView(this);
//        placesLabel.setText("Places");
//        placesLabel.setTextColor(ContextCompat.getColor(this, android.R.color.darker_gray));
//        placesLabel.setTextSize(16);
//        placesLabel.setPadding(16, 16, 16, 8); // Add padding
//        mainLayout.addView(placesLabel);
//
//        // List of Places (LinearLayout Vertical)
//        LinearLayout placesList = new LinearLayout(this);
//        placesList.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        placesList.setOrientation(LinearLayout.VERTICAL);
//
//        // Add each place as a row
//        addPlaceRow(placesList, android.R.drawable.ic_menu_recent_history, "Recent");
//        addPlaceRow(placesList, android.R.drawable.ic_menu_share, "Shared with me");
//        addPlaceRow(placesList, android.R.drawable.ic_menu_mylocation, "This device");
//        addPlaceRow(placesList, android.R.drawable.ic_menu_upload, "Browse", "Google Drive, SD card, and more...");
//        addPlaceRow(placesList, android.R.drawable.ic_input_add, "Add a place", "Connect to cloud storage");
//
//        mainLayout.addView(placesList);
//
//        // Bottom Navigation Bar (LinearLayout Horizontal)
//        LinearLayout bottomNav = new LinearLayout(this);
//        bottomNav.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        bottomNav.setOrientation(LinearLayout.HORIZONTAL);
//        bottomNav.setBackgroundColor(ContextCompat.getColor(this, android.R.color.darker_gray)); // Darker gray background
//
//        // Add navigation items
//        addNavItem(bottomNav, android.R.drawable.ic_menu_recent_history, "Recent");
//        addNavItem(bottomNav, android.R.drawable.ic_menu_share, "Shared");
//        addNavItem(bottomNav, android.R.drawable.ic_menu_upload, "Open");
//
//        mainLayout.addView(bottomNav);
//
//        setContentView(mainLayout);
//    }
//
//    private void addPlaceRow(LinearLayout parent, int iconResId, String title) {
//        addPlaceRow(parent, iconResId, title, null);
//    }
//
//    private void addPlaceRow(LinearLayout parent, int iconResId, String title, String subtitle) {
//        LinearLayout row = new LinearLayout(this);
//        row.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        row.setOrientation(LinearLayout.HORIZONTAL);
//        row.setPadding(16, 24, 16, 24); // Add padding
//
//        ImageView icon = new ImageView(this);
//        icon.setImageResource(iconResId);
//        icon.setColorFilter(ContextCompat.getColor(this, android.R.color.white));
//        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        iconParams.rightMargin = 16; // Add margin
//        icon.setLayoutParams(iconParams);
//        row.addView(icon);
//
//        LinearLayout textLayout = new LinearLayout(this);
//        textLayout.setLayoutParams(new LinearLayout.LayoutParams(
//                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1)); // Weight to expand
//        textLayout.setOrientation(LinearLayout.VERTICAL);
//
//        TextView titleText = new TextView(this);
//        titleText.setText(title);
//        titleText.setTextColor(ContextCompat.getColor(this, android.R.color.white));
//        textLayout.addView(titleText);
//
//        if (subtitle != null) {
//            TextView subtitleText = new TextView(this);
//            subtitleText.setText(subtitle);
//            subtitleText.setTextColor(ContextCompat.getColor(this, android.R.color.darker_gray));
//            subtitleText.setTextSize(12);
//            textLayout.addView(subtitleText);
//        }
//
//        row.addView(textLayout);
//        parent.addView(row);
//    }
//
//    private void addNavItem(LinearLayout parent, int iconResId, String title) {
//        LinearLayout navItem = new LinearLayout(this);
//        navItem.setLayoutParams(new LinearLayout.LayoutParams(
//                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1)); // Weight to distribute equally
//        navItem.setOrientation(LinearLayout.VERTICAL);
//        navItem.setGravity(Gravity.CENTER);
//        navItem.setPadding(0, 16, 0, 16); // Add padding
//
//        ImageView icon = new ImageView(this);
//        icon.setImageResource(iconResId);
//        icon.setColorFilter(ContextCompat.getColor(this, android.R.color.white));
//        navItem.addView(icon);
//
//        TextView titleText = new TextView(this);
//        titleText.setText(title);
//        titleText.setTextColor(ContextCompat.getColor(this, android.R.color.white));
//        titleText.setTextSize(12);
//        navItem.addView(titleText);
//
//        parent.addView(navItem);
//    }
//}