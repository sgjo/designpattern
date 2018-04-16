package com.spectra.designpattern.domain.speaker;

import com.spectra.designpattern.domain.talk.TalkMessage;

import java.util.UUID;

/**
 * Created by sgjo on 2018. 4. 4..
 */
public class Client extends AbstractSpeaker {

    public Client(String name)
    {
        super(name);
    }


    public void register() {

        getRouterConnector().connectClient(this);

    }

    public void listen(TalkMessage talkMessage) {

        System.out.println("Client {"+this.name+"} 	 >> "+talkMessage.toString());

    }

    public void talking(UUID chatRoomId, TalkMessage message) {

        getChatRoomConnector().talking(chatRoomId, message);

    }

    public void close(UUID chatRoomId) {

    }

    public void notifyOpenChatRoom(UUID chatRoomId) {

        listen(new TalkMessage("상담창이 열렸습니다. ["+chatRoomId+"]"));
        talking(chatRoomId, new TalkMessage("할 말 있어요"));
    }

    /*private UUID id;
    private String name;

    private ChatRoom chatRoom;

    public Client(String name)
    {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public boolean register()
    {
        System.out.println("Register");
        Router router = Router.getInstance();

        return router.register(this);
    }

    public void listen(String message)
    {
        System.out.println("Client Listen: "+message);
    }

    public void send(String message)
    {
        //System.out.println("Send:"+message);
        chatRoom.send(message);
    }

    public String getId() {
        return id.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }*/
}
