public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChatService = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChatService);
        chatService.sendMessage("Hello world!");
    }
}
