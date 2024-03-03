import React, { Component } from "react";
import "./LoginPage.css";
import Grid from "@mui/material/Grid";
import inst_img from "../../images/9364675fb26a.svg";
import inst_logo from "../../images/logoinsta.png";
import fb from "../../images/fb.png";
import appstore from "../../images/app.png";
import playstore from "../../images/play.png";
import SignIn from "../SignIn/SignIN";
import Signup from "../SignUp/Signup";


class LoginPage extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLogin : true
    };
  }
  
     changeLogin=()=>{
      if(this.state.isLogin)
        this.setState({isLogin: false});
      else
        this.setState({isLogin: true});
    }
    
  render() {
    return (
      <div>
        <Grid container>
          <Grid item xs={3}>
           
          </Grid>
          <Grid item xs={6}>
            <div className="logoimg_main">
              <div>
                <img src={inst_img} alt="" width="454px" />
              </div>
              <div className="loginpage_rightcomponent">
                <img className="logoimg_logo" src={inst_logo} alt="Login page logo" width="454px" />
                <div className="loginpage_signin">

                  {
                    this.state.isLogin ? <SignIn /> : <Signup />
                  }
              
                  <div className="login_separator">
                    <div className="login_dividor"></div>
                    <div className="login_OR">OR</div>
                    <div className="login_dividor"></div>
                  </div>

                  <div className="login_fb"><img src={fb} width="15px" alt="" style={ {"marginRight":"5px"}}/>Log in with facebook</div>
                  <div className="login_pw">Forgot Password?</div>

                </div>

                <div className="loginpage_signinoptions">
                  {
                    this.state.isLogin ? <div className="loginpage_sign1">
                    Don't have an account? <span onClick={this.changeLogin} style={{"fontWeight":"bold","color":"#0395F6"}}>Sign up</span>
                  </div> :<div className="loginpage_sign2">
                    Have an account? <span onClick={this.changeLogin} style={{"fontWeight":"bold","color":"#0395F6"}}>Sign in</span>
                  </div>
                  }
                  
                  
                </div>

                <div className="loginpage_downloadselection">
                  <div >Get the App.</div>
                  <div className="loginpage_option">
                    <img  className="loginpage_dwing" alt="" src={appstore} width="136px"/>
                    <img  className="loginpage_dwing" alt="" src={playstore} width="136px"/>
                  </div>
                </div>
              </div>
            </div>
          </Grid>
          <Grid item xs={3}>
           
          </Grid>
        </Grid>
      </div>
    );
  }
}

export default LoginPage;
