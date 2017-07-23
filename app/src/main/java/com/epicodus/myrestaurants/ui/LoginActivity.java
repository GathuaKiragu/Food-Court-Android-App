package com.epicodus.myrestaurants.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.epicodus.myrestaurants.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = LoginActivity.class.getSimpleName();

<<<<<<< HEAD
    @Bind(R.id.passwordLoginButton) Button mPasswordLoginButton;
    @Bind(R.id.emailEditText) EditText mEmailEditText;
    @Bind(R.id.passwordEditText) EditText mPasswordEditText;
    @Bind(R.id.registerTextView) TextView mRegisterTextView;

=======
    @Bind(R.id.passwordLoginButton)
    Button mPasswordLoginButton;
    @Bind(R.id.registerTextView)
    TextView mRegisterTextView;
    @Bind(R.id.emailEditText)
    EditText mEmailEditText;
    @Bind(R.id.passwordEditText) EditText mPasswordEditText;
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private ProgressDialog mAuthProgressDialog;

<<<<<<< HEAD
=======


>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
<<<<<<< HEAD

=======
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
        ButterKnife.bind(this);

        mRegisterTextView.setOnClickListener(this);
        mPasswordLoginButton.setOnClickListener(this);
<<<<<<< HEAD

        mAuth = FirebaseAuth.getInstance();
        createAuthProgressDialog();

        mAuthListener = new FirebaseAuth.AuthStateListener() {

=======
        mAuth = FirebaseAuth.getInstance();
        createAuthProgressDialog();

//        State listener
        mAuthListener = new FirebaseAuth.AuthStateListener(){
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                }
            }
<<<<<<< HEAD

=======
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
        };
    }

    @Override
<<<<<<< HEAD
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }

    private void loginWithPassword() {
        String email = mEmailEditText.getText().toString().trim();
        String password = mPasswordEditText.getText().toString().trim();

=======
    public void onClick(View view) {
        if (view == mRegisterTextView) {
            Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
            startActivity(intent);
            finish();
        }if(view == mPasswordLoginButton){
            loginWithPassword();
        }
    }

//Method to prohibit users from entering wrong information
    private void loginWithPassword() {
        String email = mEmailEditText.getText().toString().trim();
        String password = mPasswordEditText.getText().toString().trim();
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
        if (email.equals("")) {
            mEmailEditText.setError("Please enter your email");
            return;
        }
<<<<<<< HEAD

=======
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
        if (password.equals("")) {
            mPasswordEditText.setError("Password cannot be blank");
            return;
        }
<<<<<<< HEAD

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
=======
// Inbuilt firebase  authetication method to check provided user credentials with hhe saved credentials
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d(TAG, "signInWithEmail:onComplete:" + task.isSuccessful());
                        mAuthProgressDialog.dismiss();
<<<<<<< HEAD

                        if (!task.isSuccessful()) {
                            Log.w(TAG, "signInWithEmail", task.getException());
=======
                        if (!task.isSuccessful()) {
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
                            Toast.makeText(LoginActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
<<<<<<< HEAD

=======
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    }

    private void createAuthProgressDialog() {
        mAuthProgressDialog = new ProgressDialog(this);
        mAuthProgressDialog.setTitle("Loading...");
<<<<<<< HEAD
        mAuthProgressDialog.setMessage("Authenticating with Firebase...");
        mAuthProgressDialog.setCancelable(false);
    }

    @Override
    public void onClick(View view) {

        if (view == mRegisterTextView) {
            Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
            startActivity(intent);
            finish();
        }

        if (view == mPasswordLoginButton) {
            loginWithPassword();
        }

=======
        mAuthProgressDialog.setMessage("Setting Up Your Account...");
        mAuthProgressDialog.setCancelable(false);
    }
    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
>>>>>>> a6de4cee6a53996328f5c522dcbdb15d29c4b9a2
    }
}
