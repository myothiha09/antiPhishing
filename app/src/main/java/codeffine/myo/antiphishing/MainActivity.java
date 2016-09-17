package codeffine.myo.antiphishing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (id == R.id.newAccountButton) {
            webView.loadUrl("https://www.facebook.com/r.php");
        } else if (id == R.id.loginButton) {
            webView.loadUrl("http://codeffine.weebly.com/techfeed/vulnerabilities-and-pitfalls-of-the-tech-sector-in-myanmar");
        } else if (id == R.id.forgotPasswordButton) {
            webView.loadUrl("https://www.facebook.com/login/identify");
        }

    }
}
