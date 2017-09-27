/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Ashlee
 */
public class MessageService {
    private Input messageInput;
    private Output messageOutput;
    
     public final void produceMessage(){
        String message = messageInput.readMessage();
        messageOutput.messageOutput(message);
    }
     
//     public MessageService(messageInput input){
//        setInput(input);
//        setOutput(output);
//    }
    public Input getMessageInput() {
        return messageInput;
    }

    public void setMessageInput(Input messageInput) {
        this.messageInput = messageInput;
    }

    public Output getMessageOutput() {
        return messageOutput;
    }

    public void setMessageOutput(Output messageOutput) {
        this.messageOutput = messageOutput;
    }

}
