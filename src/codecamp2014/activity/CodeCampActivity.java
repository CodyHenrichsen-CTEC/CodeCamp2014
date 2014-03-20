package codecamp2014.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class CodeCampActivity extends Activity
{

	private Button frontButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_code_camp);
		
		
		frontButton = (Button) findViewById(R.id.front_button);
		setupListeners();
	}

	private void setupListeners()
	{
		frontButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				frontButton.setText("");
				
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.code_camp, menu);
		return true;
	}

}
