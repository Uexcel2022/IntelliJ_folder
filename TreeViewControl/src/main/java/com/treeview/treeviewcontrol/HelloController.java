package com.treeview.treeviewcontrol;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TreeView<String> treeView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TreeItem<String> rootItem = new TreeItem<>("File", new ImageView(new Image("file.jpg")));

        TreeItem<String> branchItem1 = new TreeItem<>("Picture");
        TreeItem<String> branchItem2 = new TreeItem<>("Video");
        TreeItem<String> branchItem3 = new TreeItem<>("Music");

        TreeItem<String> leveItem1 = new TreeItem<>("picture1");
        TreeItem<String> leveItem2 = new TreeItem<>("picture2");
        TreeItem<String> leveItem3 = new TreeItem<>("music1");
        TreeItem<String> leveItem4 = new TreeItem<>("music2");
        TreeItem<String> leveItem5 = new TreeItem<>("video1");
        TreeItem<String> leveItem6 = new TreeItem<>("video2");

        branchItem1.getChildren().add(leveItem1);
        branchItem1.getChildren().add(leveItem2);
        branchItem2.getChildren().add(leveItem5);
        branchItem2.getChildren().add(leveItem6);
        branchItem3.getChildren().add(leveItem3);
        branchItem3.getChildren().add(leveItem4);

        rootItem.getChildren().add(branchItem1);
        rootItem.getChildren().add(branchItem2);
        rootItem.getChildren().add(branchItem3);

        treeView.setRoot(rootItem);

//        treeView.setShowRoot(false); //to hide the root item

    }

    @FXML
    protected void selectedItem() {

        TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
        if (item != null) {
            System.out.println(item.getValue());
        }

    }


}