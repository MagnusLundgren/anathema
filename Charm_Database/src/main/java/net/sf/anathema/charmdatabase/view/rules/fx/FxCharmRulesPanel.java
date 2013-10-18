package net.sf.anathema.charmdatabase.view.rules.fx;

import net.miginfocom.layout.AC;
import net.miginfocom.layout.CC;
import net.miginfocom.layout.LC;
import net.sf.anathema.character.main.magic.charm.duration.Duration;
import net.sf.anathema.character.main.magic.charm.type.CharmType;
import net.sf.anathema.charmdatabase.presenter.CharmTypeUi;
import net.sf.anathema.charmdatabase.presenter.DurationUi;
import net.sf.anathema.charmdatabase.view.fx.AbstractFxContainerPanel;
import net.sf.anathema.charmdatabase.view.rules.CharmCostsPanel;
import net.sf.anathema.charmdatabase.view.rules.CharmKeywordsPanel;
import net.sf.anathema.charmdatabase.view.rules.CharmLearnPrerequisiteStringBuilder;
import net.sf.anathema.charmdatabase.view.rules.CharmPrerequisitesPanel;
import net.sf.anathema.charmdatabase.view.rules.CharmRulesPanel;
import net.sf.anathema.charmdatabase.view.rules.CharmTraitMinimumsPanel;
import net.sf.anathema.framework.environment.Resources;
import net.sf.anathema.lib.gui.selection.ObjectSelectionView;
import net.sf.anathema.platform.fx.NodeHolder;
import net.sf.anathema.platform.fx.selection.SelectionViewFactory;

public class FxCharmRulesPanel extends AbstractFxContainerPanel implements CharmRulesPanel, NodeHolder {
  private final FxCharmPrerequisitesPanel prerequisitesPanel;
  private final FxCharmTraitsPanel traitsPanel;
  private final FxCharmCostsPanel costsPanel;
  private final FxCharmKeywordsPanel keywordsPanel;

  public FxCharmRulesPanel(Resources resources, SelectionViewFactory selectionFactory) {
    super(selectionFactory, new LC().wrapAfter(2).fill().insets("4"), new AC(), new AC().index(1).shrinkPrio(200));
    prerequisitesPanel = new FxCharmPrerequisitesPanel(new CharmLearnPrerequisiteStringBuilder(resources));
    traitsPanel = new FxCharmTraitsPanel(resources);
    costsPanel = new FxCharmCostsPanel(resources);
    keywordsPanel = new FxCharmKeywordsPanel(resources);
  }

  @Override
  public CharmPrerequisitesPanel addPrerequisitesPanel(final String title) {
    addSubpanel(prerequisitesPanel, title, new CC().grow().push());
    return prerequisitesPanel;
  }

  @Override
  public CharmTraitMinimumsPanel addTraitsPanel(final String title) {
    addSubpanel(traitsPanel, title, new CC().grow().push());
    return traitsPanel;
  }

  @Override
  public CharmCostsPanel addCostsPanel(final String title) {
    addSubpanel(costsPanel, title, new CC().grow().push());
    return costsPanel;
  }

  @Override
  public CharmKeywordsPanel addKeywordsPanel(final String title) {
    addSubpanel(keywordsPanel, title, new CC().grow().push());
    return keywordsPanel;
  }

  @Override
  public ObjectSelectionView<CharmType> addTypeView(String label, CharmTypeUi ui) {
    return addSelectionView(label, ui, new CC().grow());
  }

	@Override
	public ObjectSelectionView<Duration> addDurationView(String label, DurationUi ui) {
		return addSelectionView(label, ui, new CC().grow());
	}
}