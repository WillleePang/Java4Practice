package com.willlee.designpatterns.proxy.fontprovider;

public class Client {
	public static void main(String[] args) {
		FontProvider fontProvider = ProviderFactory.getFontProvider();
		fontProvider.getFont("΢���ź�");
		
		ImageProvider imageProvider = ProviderFactory.getImageProvider();
		imageProvider.getImage("ͷ��");
		
		
	}
}
