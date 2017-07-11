/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.helper;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.color.RGBValuesProvider;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.BorderedStyle;
import org.eclipse.sirius.diagram.ContainerStyle;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.Ellipse;
import org.eclipse.sirius.diagram.NodeStyle;
import org.eclipse.sirius.diagram.Square;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.StyleHelper;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.sirius.viewpoint.Style;
import org.eclipse.sirius.viewpoint.description.ColorDescription;
import org.eclipse.sirius.viewpoint.description.ComputedColor;
import org.eclipse.sirius.viewpoint.description.FixedColor;
import org.eclipse.sirius.viewpoint.description.InterpolatedColor;
import org.eclipse.swt.graphics.RGB;

/**
 * Utility class to handle style, size and location
 */
public class ShapeUtil {

  /*************************** DRAW2D BASED ********************************/

  /**
   * Convert a RGB value to RGBValues
   * @param RGB color
   * @return RGBValues
   */
  public static RGBValues convertRGBtoRGBValues(RGB color) {
    if (color == null) {
      return null;
    }
    RGBValues newValuesContent = RGBValues.create(color.red, color.green, color.blue);

    return newValuesContent;
  }

  public static RGBValues getBlackColor() {
    return convertRGBtoRGBValues(new RGB(0, 0, 0));
  }

  

  /*************************** GMF BASED ********************************/

  /**
   * get the color of the node
   * @param node
   * @return get the color of the node
   */
  public static RGBValues getNodeColorStyle(DNode node) {

    NodeStyle shape = node.getOwnedStyle();
    if (shape instanceof Ellipse) {
      return ((Ellipse) shape).getColor();
    } else if (shape instanceof Square) {
      return ((Square) shape).getColor();
    }
    return null;
  }

  public static boolean isRed(RGBValues color) {
    return ((color.getRed() == 255) && (color.getGreen() == 0) && (color.getBlue() == 0));
  }

  public static boolean isSameColor(RGBValues color1, RGB color2) {
    return isSameColor(color1, convertRGBtoRGBValues(color2));
  }

  public static boolean isSameColor(RGBValues color1, RGBValues color2) {
    if ((color1 == null) && (color2 == null)) {
      return true;
    }
    if ((color1 == null) || (color2 == null)) {
      return false;
    }
    return ((color1.getGreen() == color2.getGreen()) && (color1.getBlue() == color2.getBlue()) && (color1.getRed() == color2.getRed()));
  }

  public static void removeColorFromList(RGBValues colorToRemove, Collection<RGB> colorList) {
    RGB toRemove = null;
    for (RGB aColor : colorList) {
      if (isSameColor(colorToRemove, aColor)) {
        toRemove = aColor;
      }
    }
    if (toRemove != null) {
      colorList.remove(toRemove);
    }
  }

  /*************************** SIRIUS BASED ********************************/

  /**
   * Set the color format edge
   * @param DEdge currentEdge
   * @param color
   */
  public static void setEdgeColorStyle(DEdge currentEdge, RGB color) {
    if ((currentEdge != null) && (color != null)) {
      EdgeStyle edgeStyle = currentEdge.getOwnedStyle();
      RGBValues c = convertRGBtoRGBValues(color);
      if ((edgeStyle != null) && !isSameColor(c, edgeStyle.getStrokeColor())) {
        edgeStyle.setStrokeColor(c);
        ShapeUtil.addCustomisation(edgeStyle, new EStructuralFeature[] { DiagramPackage.Literals.EDGE_STYLE__STROKE_COLOR });
        getStyleHelper(currentEdge).refreshStyle(edgeStyle);
      }
    }
  }

  /**
   * Set the color format edge
   * @param DEdge currentEdge
   * @param color
   */
  public static void resetEdgeColorStyle(DEdge currentEdge, RGB color) {
    if ((currentEdge != null) && (color != null)) {
      EdgeStyle edgeStyle = currentEdge.getOwnedStyle();
      RGBValues c = convertRGBtoRGBValues(color);
      if ((edgeStyle != null) && !isSameColor(c, edgeStyle.getStrokeColor())) {
        edgeStyle.setStrokeColor(c);
        ShapeUtil.removeCustomisation(edgeStyle, new EStructuralFeature[] { DiagramPackage.Literals.EDGE_STYLE__STROKE_COLOR });
        getStyleHelper(currentEdge).refreshStyle(edgeStyle);
      }
    }
  }

  /**
   * Set the thickness format Edge
   * @param DEdge currentNode
   * @param Color
   * @return
   */
  public static boolean setEdgeThickStyle(DEdge currentEdge, Integer pThick) {
    if ((currentEdge != null) && (pThick != null)) {
      EdgeStyle edgeStyle = currentEdge.getOwnedStyle();
      if (edgeStyle.getSize().intValue() != pThick.intValue()) {
        edgeStyle.setSize(pThick);
        ShapeUtil.addCustomisation(edgeStyle, new EStructuralFeature[] { DiagramPackage.Literals.EDGE_STYLE__SIZE });
        getStyleHelper(currentEdge).refreshStyle(edgeStyle);
        return true;
      }
    }
    return false;
  }

  /**
   * Set the thickness format Edge
   * @param DEdge currentNode
   * @param Color
   * @return
   */
  public static boolean resetEdgeThickStyle(DEdge currentEdge, Integer pThick) {
    if ((currentEdge != null) && (pThick != null)) {
      EdgeStyle edgeStyle = currentEdge.getOwnedStyle();
      if (edgeStyle.getSize().intValue() != pThick.intValue()) {
        edgeStyle.setSize(pThick);
        ShapeUtil.removeCustomisation(edgeStyle, new EStructuralFeature[] { DiagramPackage.Literals.EDGE_STYLE__SIZE });
        getStyleHelper(currentEdge).refreshStyle(edgeStyle);
        return true;
      }
    }
    return false;
  }

  /**
   * Set the border color format Node
   * @param DNodeContainer currentNode
   * @param Color
   * @return
   */
  public static boolean setBorderColorStyle(AbstractDNode currentNode, RGB color) {
    if ((currentNode != null) && (color != null)) {
      Style style = getCurrentStyle(currentNode);
      if (style instanceof BorderedStyle) {
        BorderedStyle bStyle = (BorderedStyle) style;
        RGBValues vColor = convertRGBtoRGBValues(color);
        if (!isSameColor(vColor, bStyle.getBorderColor())) {
          bStyle.setBorderColor(vColor);
          ShapeUtil.addCustomisation(style, new EStructuralFeature[] { DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR });
          getStyleHelper(currentNode).refreshStyle(style);
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Set the border color format Node
   * @param DNodeContainer currentNode
   * @param Color
   * @return
   */
  public static boolean resetBorderColorStyle(AbstractDNode currentNode, RGB color) {
    if ((currentNode != null) && (color != null)) {
      Style style = getCurrentStyle(currentNode);
      if (style instanceof BorderedStyle) {
        BorderedStyle bStyle = (BorderedStyle) style;
        RGBValues vColor = convertRGBtoRGBValues(color);
        if (!isSameColor(vColor, bStyle.getBorderColor())) {
          bStyle.setBorderColor(vColor);
          ShapeUtil.removeCustomisation(style, new EStructuralFeature[] { DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR });
          getStyleHelper(currentNode).refreshStyle(style);
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Set the border format Node
   * @param DNodeContainer currentNode
   * @param Color
   * @return
   */
  public static boolean setBorderStyle(AbstractDNode currentNode, Integer pThick) {
    if ((currentNode != null) && (pThick != null)) {
      Style style = ShapeUtil.getCurrentStyle(currentNode);
      if (style instanceof BorderedStyle) {
        BorderedStyle bStyle = (BorderedStyle) style;
        if (!bStyle.getBorderSize().equals(pThick)) {
          bStyle.setBorderSize(pThick);
          ShapeUtil.addCustomisation(bStyle, new EStructuralFeature[] { DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE });
          getStyleHelper(currentNode).refreshStyle(bStyle);
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Set the border format Node
   * @param DNodeContainer currentNode
   * @param Color
   * @return
   */
  public static boolean resetBorderStyle(AbstractDNode currentNode, Integer pThick) {
    if ((currentNode != null) && (pThick != null)) {
      Style style = ShapeUtil.getCurrentStyle(currentNode);
      if (style instanceof BorderedStyle) {
        BorderedStyle bStyle = (BorderedStyle) style;
        if (!bStyle.getBorderSize().equals(pThick)) {
          bStyle.setBorderSize(pThick);
          ShapeUtil.removeCustomisation(bStyle, new EStructuralFeature[] { DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE });
          getStyleHelper(currentNode).refreshStyle(bStyle);
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Set the color format Node
   * @param DNode currentNode
   * @param RGB color
   */
  public static void setColorStyle(DNode currentNode, RGB color) {
    if ((currentNode != null) && (color != null)) {
      NodeStyle shape = currentNode.getOwnedStyle();

      if (shape instanceof Ellipse) {
        ShapeUtil.addCustomisation(shape, new EStructuralFeature[] { DiagramPackage.Literals.ELLIPSE__COLOR });
        ((Ellipse) shape).setColor(RGBValues.create(color.red, color.green, color.blue));

      } else if (shape instanceof Square) {
        ShapeUtil.addCustomisation(shape, new EStructuralFeature[] { DiagramPackage.Literals.SQUARE__COLOR });
        ((Square) shape).setColor(RGBValues.create(color.red, color.green, color.blue));
      }

      getStyleHelper(currentNode).refreshStyle(shape);
    }
  }

  public static Style getCurrentStyle(DDiagramElement element) {
    if (element instanceof DNodeContainer) {
      return ((DNodeContainer) element).getOwnedStyle();

    } else if (element instanceof DNodeList) {
      return ((DNodeList) element).getOwnedStyle();

    } else if (element instanceof DNode) {
      return ((DNode) element).getOwnedStyle();

    } else if (element instanceof DEdge) {
      return ((DEdge) element).getOwnedStyle();
    }
    return null;
  }

  /**
   * @param aEdge
   * @param desc
   * @return
   */
  public static RGB getDefaultColor(DSemanticDecorator aEdge, EObject desc, ColorDescription descColor) {
    RGBValues color = null;
    if (descColor != null) {
      RGBValuesProvider colors = new RGBValuesProvider();
      if (descColor instanceof FixedColor) {
        color = colors.getRGBValues((FixedColor) descColor);

      } else if (descColor instanceof ComputedColor) {
        color = colors.getRGBValues((ComputedColor) descColor, aEdge.getTarget(), InterpreterUtil.getInterpreter(aEdge.getTarget()));

      } else if (descColor instanceof InterpolatedColor) {
        color = colors.getRGBValues((InterpolatedColor) descColor, aEdge.getTarget(), InterpreterUtil.getInterpreter(aEdge.getTarget()));
      }
    }

    if (color == null) {
      return new RGB(0, 0, 0);
    }
    return new RGB(color.getRed(), color.getGreen(), color.getBlue());

  }

  /**
   * @param element
   * @param targetView
   */
  public static void copyCustomStyle(DDiagramElement sourceElement, DDiagramElement targetElement) {
    EObject sourceStyle = null;
    // EObject targetStyle = null;

    if ((sourceElement instanceof DNodeContainer) && (targetElement instanceof DNodeContainer)) {
      DNodeContainer srcElement = (DNodeContainer) sourceElement;
      DNodeContainer tgtElement = (DNodeContainer) targetElement;
      sourceStyle = srcElement.getOwnedStyle();
      // targetStyle = tgtElement.getOwnedStyle();

      EObject style = EcoreUtil.copy(sourceStyle);
      tgtElement.setOwnedStyle((ContainerStyle) style);

    } else if ((sourceElement instanceof DNode) && (targetElement instanceof DNode)) {
      DNode srcElement = (DNode) sourceElement;
      DNode tgtElement = (DNode) targetElement;
      sourceStyle = srcElement.getOwnedStyle();
      // targetStyle = tgtElement.getOwnedStyle();

      EObject style = EcoreUtil.copy(sourceStyle);
      tgtElement.setOwnedStyle((NodeStyle) style);

    } else if ((sourceElement instanceof DEdge) && (targetElement instanceof DEdge)) {
      DEdge srcElement = (DEdge) sourceElement;
      DEdge tgtElement = (DEdge) targetElement;
      sourceStyle = srcElement.getOwnedStyle();
      // targetStyle = tgtElement.getOwnedStyle();

      EObject style = EcoreUtil.copy(sourceStyle);
      tgtElement.setOwnedStyle((EdgeStyle) style);
    }
  }

  private static StyleHelper getStyleHelper(DSemanticDecorator semanticDecorator) {
    return new StyleHelper(SiriusPlugin.getDefault().getInterpreterRegistry().getInterpreter(semanticDecorator.getTarget()));
  }

  /**
   * API changes
   */
  public static void removeCustomisation(Style style, EStructuralFeature[] features) {
    for (EStructuralFeature feature : features) {
      style.getCustomFeatures().remove(feature.getName());
    }
  }

  public static boolean isCustomisation(Style style, EStructuralFeature feature) {
    for (String name : style.getCustomFeatures()) {
      if (name.equals(feature.getName())) {
        return true;
      }
    }
    return false;
  }

  public static void addCustomisation(Style style, EStructuralFeature[] features) {
    for (EStructuralFeature feature : features) {
      style.getCustomFeatures().add(feature.getName());
    }
  }

  /**
   * API changes
   */
  public static void setCustom(Style style, boolean value) {
    if (!value) {
      style.getCustomFeatures().clear();
    }
  }

  /**
   * API changes
   */
  public static boolean isCustom(Style style) {
    return !style.getCustomFeatures().isEmpty();
  }
}
