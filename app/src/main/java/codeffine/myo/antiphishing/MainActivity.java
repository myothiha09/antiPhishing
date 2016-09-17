package codeffine.myo.antiphishing;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends Activity implements View.OnClickListener {

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
            webView.loadUrl("http://www.codeffine.weebly.com/techfeed/vulnerabilities-and-pitfalls-of-the-tech-sector-in-myanmar");
        }
        if (id == R.id.loginButton) {
            webView.loadUrl("http://www.codeffine.weebly.com/techfeed/vulnerabilities-and-pitfalls-of-the-tech-sector-in-myanmar");
        }

        if (id == R.id.forgotPasswordButton) {
            webView.loadUrl("http://www.codeffine.weebly.com/techfeed/vulnerabilities-and-pitfalls-of-the-tech-sector-in-myanmar");
        }

    }
}
