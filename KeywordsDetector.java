public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i=0;i<sentences.length;i++)
        {
            for(int j=0;j<keywords.length;j++)
            {
                if(inSen(sentences[i],keywords[j]))
                {
                    System.out.println(sentences[i]);
                    break;

                }
            }

        }
    }
    public static boolean inSen(String str1,String str2){
        boolean flag=false;
        for(int i=0;i<=str1.length()-str2.length();i++)
        {
            if(lowerCase(str1.substring(i,i+str2.length())).equals(lowerCase(str2)))
            {
                flag=true;
                break;
            }
        }
        return flag;
    } 
    public static String lowerCase(String str) {
        String newS="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>= 'A'&&str.charAt(i)<='Z')
            {
                newS+=(char)(str.charAt(i)+32);
            }
            else
            {
                newS+=str.charAt(i);
            }
        }
        return newS;
    }
}
