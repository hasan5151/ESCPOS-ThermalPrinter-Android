package com.dantsu.escposprinter;

public class EscPosCharsetEncoding {
    private String charsetName;
    private byte[] charsetCommand;

    /**
     * Create new instance of EscPosCharsetEncoding.
     *
     * @param charsetName Name of charset encoding (Ex: windows-1252)
     * @param escPosCharsetId Id of charset encoding for your printer (Ex: 16)
     */
    public EscPosCharsetEncoding(String charsetName, int escPosCharsetId) {
        this.charsetName = charsetName;
        this.charsetCommand = new byte[]{27, 56, 1};
    }

    public byte[] getCommand() {
        return this.charsetCommand;
    }

    public String getName() {
        return this.charsetName;
    }
}
